class Solution {
    int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int m=0;
        dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                m=Math.max(m,dfs(matrix,i,j));
            }
        }
        return m;
    }
    
    public int dfs(int[][] mat,int cr,int cc){
        int m=0;
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        for(int[] dir: directions){
            int nr=cr+dir[0];
            int nc=cc+dir[1];
            if(isValid(mat,nr,nc) && mat[nr][nc]>mat[cr][cc])
                m=Math.max(m,dfs(mat,nr,nc));
        }
        return dp[cr][cc]=m+1;
    }
    
    public boolean isValid(int[][] mat,int nr, int nc){
        return nr>=0 && nc>=0 && nr<mat.length && nc<mat[0].length;    
    } 
}