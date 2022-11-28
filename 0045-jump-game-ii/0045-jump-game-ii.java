class Solution {
    int[] dp;
    public int jump(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==Integer.MAX_VALUE) continue;
            for(int j=i+1;j<=Math.min(nums.length-1,i+nums[i]);j++)
                dp[j]=Math.min(dp[j],dp[i]+1);
        }
        return dp[nums.length-1];
    }
}