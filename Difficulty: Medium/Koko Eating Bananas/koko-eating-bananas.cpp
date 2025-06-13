class Solution {
public:
    int calculateHours(vector<int>& arr, int speed) {
        int hours = 0;
        for (int bananas : arr) {
            hours += (bananas + speed - 1) / speed; // same as ceil(bananas / speed)
        }
        return hours;
    }

    int kokoEat(vector<int>& arr, int k) {
        int low = 1;
        int high = *max_element(arr.begin(), arr.end());
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int hours = calculateHours(arr, mid);

            if (hours <= k) {
                result = mid;       // Try smaller speed
                high = mid - 1;
            } else {
                low = mid + 1;      // Try larger speed
            }
        }

        return result;
    }
};
