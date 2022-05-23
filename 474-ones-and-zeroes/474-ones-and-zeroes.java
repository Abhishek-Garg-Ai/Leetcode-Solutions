class Solution {
    int[][][] dp;
    int[] cnt_0;
    public int findMaxForm(String[] strs, int m, int n) {
        cnt_0=new int[strs.length];
        int p=0;
        for(String str:strs) cnt_0[p++]=count_0(str); 
        dp=new int[strs.length][m+1][n+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                Arrays.fill(dp[i][j],-1);
        return helper(strs,0,m,n);
    }
    
    public int helper(String[] strs, int curr, int m ,int n){
        if(curr>=strs.length) return 0;
        if(dp[curr][m][n]!=-1) return dp[curr][m][n];
        int c_0=cnt_0[curr];
        int c_1=strs[curr].length()-c_0;
        int max=0;
        if(c_0<=m && c_1<=n)
        max=helper(strs,curr+1,m-c_0,n-c_1)+1;
        max=Math.max(max,helper(strs,curr+1,m,n));
        return dp[curr][m][n]=max;
    }
    
    public int count_0(String str){
        int c_0=0;
        for(char ch: str.toCharArray()) if(ch=='0') c_0+=1;
        return c_0;
    }
}