class Solution {
    // int[] parent;
    int[][] dp;
    int[][] directions=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        // parent=new int
        int ans=0;
        dp=new int[grid1.length][grid1[0].length];
        // for(int i=0;i< dp.length; i++) Arrays
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid2[i][j]==1){
                    if(is_sub_island(grid1, grid2, i, j)==1){
                        ans+=1;
                    }
                }
            }
        }
        return ans;
    }
    
    public int is_sub_island(int[][] grid1, int[][] grid2, int cr, int cc){
        if(cr<0 || cc<0 || cr>=grid1.length || cc>=grid1[0].length || grid2[cr][cc]==0)
            return 1;
        if(grid1[cr][cc]==0) return -1;
        if(dp[cr][cc]!=0) return dp[cr][cc];
        grid2[cr][cc]=0;
        grid1[cr][cc]=0;
        for(int[] dir: directions){
            if(is_sub_island(grid1,grid2, cr+dir[0],cc+dir[1])==-1){
                grid2[cr][cc]=1;
                grid1[cr][cc]=1;
                return dp[cr][cc]=-1;
            }
        }
        return dp[cr][cc]=1;
    }
}