class Solution {
    int[][] dp;
    public int countSubstrings(String s) {
        int n=s.length();
        dp=new int[n][n];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(helper(s,i,j)==1) ans+=1;
            }
        }
        return ans;
        
    }
    
    public int helper(String s,int i,int j){
        if(i==j) return 1; // single char
        if(j==i+1) return s.charAt(i)==s.charAt(j)?1:-1; //double char
        if(j<i) return -1;
        if(dp[i][j]!=0) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return dp[i][j]=helper(s,i+1,j-1);
        return -1;
    }
}