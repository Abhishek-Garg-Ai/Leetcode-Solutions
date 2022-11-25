class Solution {
    int ans=0;
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int[] a:dp) Arrays.fill(a,-1);
        return helper(text1,text2,0,0);
        
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