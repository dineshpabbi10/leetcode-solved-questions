class Solution {
    public int reverse(int x) {
        int res = 0;
        int MIN = Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;

        while(x != 0){
            if( (x>0 && (res > (int)MAX/10  || (res == (int)MAX/10 && x%10 > MAX%10))) 
            || (x<0 && ( res < (int)MIN/10 || (res == (int)MIN/10 && x%10 < MIN%10))) 
            ) return 0;

            res = res * 10 + x % 10;
            x = (int) x / 10;
        }
        return res;
    }
}