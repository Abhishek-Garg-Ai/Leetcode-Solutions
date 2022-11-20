class Solution {
    int[] dp;
    public int numDecodings(String s) {
        // if(s.charAt(0)=='0') return 0;
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(s,0);
    }
    
    public int helper(String s, int curr){
        if(curr==s.length()) return 1;
        if(curr>s.length()) return 0;
        if(s.charAt(curr)=='0') return 0;
        if(dp[curr]!=-1) return dp[curr];
        int ans=helper(s,curr+1);
        if(s.charAt(curr)-'0'==1)
            ans+=helper(s,curr+2);
        if(s.charAt(curr)-'0'==2 && curr<s.length()-1 && s.charAt(curr+1)-'0'<=6)
            ans+=helper(s,curr+2);
        return dp[curr]=ans;
    }
}