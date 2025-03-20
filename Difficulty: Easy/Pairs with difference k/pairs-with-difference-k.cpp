//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends

// User function template for C++
class Solution {
  public:
    /* Returns count of pairs with difference k  */
    int countPairs(vector<int>& arr, int k) {
        map<int,int>mp;
        int cnt=0;
        for(int j=0;j<arr.size();j++)
        {
           if(mp.find(arr[j]+k)!=mp.end()){
               cnt+=mp[arr[j]+k];
           }
          if(mp.find(arr[j]-k)!=mp.end()){
               cnt+=mp[arr[j]-k];
           }
           mp[arr[j]]++;
        }
        return cnt;
    }
};


//{ Driver Code Starts.
int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);
    while (t--) {

        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        string ks;
        getline(cin, ks);
        int k = stoi(ks);
        Solution ob;
        auto ans = ob.countPairs(arr, k);
        cout << ans << "\n";
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends