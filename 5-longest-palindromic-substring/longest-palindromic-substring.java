class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int left = 0;
        int right = 0;
        for(int i=0;i<s.length();i++) {
            // all 1 length substrings are valid palindrome
            dp[i][i] = true;
            // populate 2 length substrings
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                left = i;
                right = i+1;
            }
        }

        for(int i=2; i<s.length(); i++){
            for(int j=0;j<s.length()-i;j++){
                if(s.charAt(j) == s.charAt(j+i) && dp[j+1][j+i-1]){
                    left = j;
                    right = j+i;
                    dp[j][j+i] = true;
                }
            }
        }

        return s.substring(left,right+1);

    }
}