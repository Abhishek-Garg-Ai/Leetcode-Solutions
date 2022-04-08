class Solution {
    int[] dp;
    public int climbStairs(int n) {
        if(n<=2) return n;
        dp=new int[n];
        dp[1]=2;
        dp[0]=1;
        for(int i=2;i<n;i+=1){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}