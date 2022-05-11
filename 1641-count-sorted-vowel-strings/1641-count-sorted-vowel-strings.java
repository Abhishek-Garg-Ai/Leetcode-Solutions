class Solution {
    int[][] dp;
    public int countVowelStrings(int n) {
        dp=new int[n+1][5];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        return helper(n,0);
    }
    
    public int helper(int n,int curr_vowel){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n][curr_vowel]!=-1) return dp[n][curr_vowel];
        int ans=0;
        for(int i=curr_vowel;i<5;i++) ans+=helper(n-1,i);
        return dp[n][curr_vowel]=ans;
    }
}