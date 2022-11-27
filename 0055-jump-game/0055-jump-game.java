class Solution {
    boolean[] dp;
    public boolean canJump(int[] nums) {
        dp=new boolean[nums.length];
        dp[0]=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) continue;
            for(int j=i+1;j<=Math.min(nums.length-1,i+nums[i])&&dp[i];j++)
                dp[j]=true;
        }
        // System.out.println(Arrays.toString(dp));
        return dp[nums.length-1];
    }
    
    
}