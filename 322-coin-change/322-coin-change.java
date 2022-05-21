class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=solver(coins,amount);
        if(ans>=10000) return -1;
        return ans;
    }
    
    public int solver(int[] coins, int left){
        if(left==0) return 0;
        if(left<0) return 10000;
        if(dp[left]!=-1) return dp[left];
        int m=10000;
        for(int coin: coins) m=Math.min(m,solver(coins,left-coin));
        return dp[left]=m+1;
    }
}