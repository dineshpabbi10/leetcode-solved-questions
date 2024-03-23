class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        char direction = 'd';
        int index = 0;
        List<StringBuilder> out = new ArrayList<>();
        for(int i = 0 ;i<numRows;i++) out.add(new StringBuilder());
        
        for(int i = 0;i<s.length();i++){
            out.get(index).append(s.charAt(i));
            
            if(index == 0 && direction == 'u'){
                index = 1;
                direction = 'd';
            }
            else if(index == numRows-1 && direction == 'd'){
                index = index-1;
                direction = 'u';
            }
            else if(direction == 'd') index ++;
            else if(direction == 'u') index -- ;
        }
        
        StringBuilder res = out.get(0);
        for(int i = 1;i<out.size();i++) res.append(out.get(i).toString());
        return res.toString();
    }
}