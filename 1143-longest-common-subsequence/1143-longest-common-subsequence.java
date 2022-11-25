class Solution {
    int ans=0;
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        dp[0][0]=0;
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j))
                    dp[i+1][j+1]=dp[i][j]+1;
                dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j+1]);
                dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[text1.length()][text2.length()];
        
    }
    
    public int helper(String s1, String s2, int i1, int i2){
        if(i1==s1.length() || i2==s2.length()) return 0;
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        int ans=0;
        if(s1.charAt(i1)==s2.charAt(i2))
            ans=Math.max(ans,helper(s1,s2,i1+1,i2+1)+1);
        ans=Math.max(ans,helper(s1,s2,i1+1,i2));
        ans=Math.max(ans,helper(s1,s2,i1,i2+1));
        return dp[i1][i2]=ans;
    }
}