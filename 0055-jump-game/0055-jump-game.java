class Solution {
    boolean[] dp;
    public boolean canJump(int[] nums) {
        dp=new boolean[nums.length];
        dp[0]=true;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==false) continue;
            for(int j=i+1;j<=Math.min(nums.length-1,i+nums[i]);j++){
                if(j==nums.length-1) return true;
                dp[j]=true;
            }
        }
        return dp[nums.length-1];
    }
    
    
}