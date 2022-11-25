class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=helper(coins,amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
    
    public int helper(int[] coins, int amount){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        if(dp[amount]!=-1) return dp[amount];
        int ans=Integer.MAX_VALUE;
        for(int coin : coins) ans=Math.min(ans,helper(coins, amount-coin));
        if(ans!=Integer.MAX_VALUE) ans+=1;
        return dp[amount]=ans;
    }
}