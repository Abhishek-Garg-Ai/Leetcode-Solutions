class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int[][] mat=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i+=1){
            for(int j=1;j<=n2;j+=1){
                if(text1.charAt(i-1)==text2.charAt(j-1)) mat[i][j]=mat[i-1][j-1]+1;
                else mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
            }
        }
        return mat[n1][n2];
    }
}