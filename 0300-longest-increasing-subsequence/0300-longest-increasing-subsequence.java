class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]);
                }
            }
            dp[i]+=1;
        }
        int ans=0;
        for(int num:dp) ans=Math.max(ans,num);
        // System.out.println(Arrays.toString(dp));
        return ans;
    }
}