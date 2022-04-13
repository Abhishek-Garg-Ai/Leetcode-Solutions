class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] mat=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) mat[i][j]=mat[i-1][j-1]+1;
                else mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
            }
        }
        return mat[text1.length()][text2.length()];
    }
}