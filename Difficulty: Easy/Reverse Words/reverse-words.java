class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split("\\.");
        StringBuilder res = new StringBuilder();

       
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isEmpty()) continue; 

            if (res.length() > 0) res.append("."); 
            res.append(words[i]); 
        }

        return res.toString();
    }
}
