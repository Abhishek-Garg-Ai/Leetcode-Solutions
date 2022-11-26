class Solution {
    int[] dp;
    public boolean canJump(int[] nums) {
        dp=new int[nums.length];
        // Arrays.fill(dp,-1);
        return helper(nums,0)==1;
    }
    
    
    public int helper(int[] nums,int curr){
        if(curr==nums.length-1) return 1;
        if(curr>=nums.length) return -1;
        if(dp[curr]!=0) return dp[curr];
        int ans=-1;
        for(int i=curr+1;i<=Math.min(curr+nums[curr],nums.length);i++){
            ans=Math.max(ans,helper(nums,i));
            if(ans==1) break;
        }
        return dp[curr]=ans;
    }
}