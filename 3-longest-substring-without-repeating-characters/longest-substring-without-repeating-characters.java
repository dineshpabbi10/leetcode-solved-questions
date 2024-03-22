class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <=1 ) return s.length();

        Set<Character> usedChars = new HashSet<Character>();
        int leadPointer = 1;
        int tailPointer = 0;
        int answer = 0;
        usedChars.add(s.charAt(0));
        while(leadPointer < s.length()){
            while(usedChars.contains(s.charAt(leadPointer))){
                usedChars.remove(s.charAt(tailPointer));
                tailPointer++;
            }
            usedChars.add(s.charAt(leadPointer));
            answer = Math.max(answer,leadPointer - tailPointer + 1);
            leadPointer++;
        }
        return answer;
    }
}