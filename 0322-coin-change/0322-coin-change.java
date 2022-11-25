class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin: coins){
                if(i-coin>=0) dp[i]=Math.min(dp[i],dp[i-coin]);
            }
            if(dp[i]!=Integer.MAX_VALUE) dp[i]+=1;
        }
        if(dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];
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