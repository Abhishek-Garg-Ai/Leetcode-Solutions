class Solution {
    int[] dp;
    public int climbStairs(int n) {
        if(n<=2) return n;
        dp=new int[n+1];
        dp[2]=2;
        dp[1]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
        // if(n<=2) return n;
        // return climbStairs(n-1)+climbStairs(n-2);
    
}