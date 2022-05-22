class Solution {
    boolean[][] dp;
    public int countSubstrings(String str) {
        int n=str.length();
        dp=new boolean[n][n];
        int ans=0;
        for(int gap=0;gap<n;gap++){
            for(int s=0,e=gap; e<n;s++,e++){
                if(gap==0) dp[s][e]=true;
                else if(gap==1) dp[s][e]=str.charAt(s)==str.charAt(e);
                else{
                    if(str.charAt(s)==str.charAt(e)) dp[s][e]=dp[s+1][e-1];
                }
                if(dp[s][e]) ans+=1;
            }
        }
        return ans;
    }
}