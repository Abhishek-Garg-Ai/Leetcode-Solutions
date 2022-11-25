class Solution {
    int[] arr=new int[]{3,3,3,3,3,4,3,4};
    int mod=1000000007;
    Long[] dp;
    public int countTexts(String pressedKeys) {
        dp=new Long[pressedKeys.length()];
        return (int)helper(pressedKeys,0);
    }
    
    public long helper(String key, int curr){
        if(curr==key.length()) return 1;
        char ch=key.charAt(curr);
        long ans=0;
        int i;
        if(dp[curr]!=null) return dp[curr];
        for(i=curr+1;i<curr+arr[ch-'2'];i++){
            if(i>=key.length() || key.charAt(i)!=ch) break;
            else ans=(ans+helper(key,i))%mod;
        }
        ans=(ans+helper(key,i))%mod;
        return dp[curr]=ans;
    } 
}