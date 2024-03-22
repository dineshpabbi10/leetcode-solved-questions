class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[100009];
        return this.dfs(nums,0,dp);
    }
    
    public boolean dfs(int[] nums,int index,Boolean[] dp){
        if(index >= nums.length-1) return true;
        else if(dp[index] != null) return dp[index];
        else{
            for(int i = nums[index];i >=1;i--){
                if(this.dfs(nums,index+i,dp)){
                    dp[index] = true;
                    return true;
                }
            }
            dp[index] = false;
            return false;
        }
    }
}