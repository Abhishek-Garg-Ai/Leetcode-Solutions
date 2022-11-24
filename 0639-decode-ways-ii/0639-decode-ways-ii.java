class Solution {
    int mod=1000000007;
    Long[] dp;
    public int numDecodings(String s) {
        dp=new Long[s.length()];
        // Arrays.fill(dp,-1);
        return (int)helper(s,0);
    }
    
    public long helper(String s, int i){
        int n=s.length();
        if(i==n) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=null) return dp[i];
        long ans=0;
        if(s.charAt(i)=='*'){
            ans=ans + 9* helper(s,i+1) % mod;
            if(i<n-1 && s.charAt(i+1)=='*')
                ans = (ans + helper(s,i+2)*15) % mod;
            else{
                if(i<n-1 && s.charAt(i+1)<'7')
                    ans = (ans + helper(s,i+2)) % mod;
                if(i<n-1 && s.charAt(i+1)<='9')
                    ans = (ans + helper(s,i+2)) % mod;    
            }
        }else{
            if(s.charAt(i)=='1' && i<n-1){
                if(s.charAt(i+1)=='*') ans = (ans + helper(s,i+2) * 9) %mod;
                else ans = (ans + helper(s,i+2)) %mod;
            }
            if(s.charAt(i)=='2' && i<n-1){
                if(s.charAt(i+1)=='*') ans = (ans + helper(s,i+2) * 6) %mod;
                else if(s.charAt(i+1)<'7') ans = (ans + helper(s,i+2)) %mod;
            }
            ans = (ans + helper(s,i+1)) %mod;
        }
        return dp[i]=ans % mod;
    }
}