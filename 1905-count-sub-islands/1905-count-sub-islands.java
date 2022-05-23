class Solution {
    // int[] parent;
    int[][] directions=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        // parent=new int
        int ans=0;
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid2[i][j]==1){
                    if(is_sub_island(grid1, grid2, i, j)){
                        ans+=1;
                        // System.out.println(i+" "+j);
                    }
                }
            }
        }
        return ans;
    }
    
    public boolean is_sub_island(int[][] grid1, int[][] grid2, int cr, int cc){
        if(cr<0 || cc<0 || cr>=grid1.length || cc>=grid1[0].length || grid2[cr][cc]==0)
            return true;
        if(grid1[cr][cc]==0) return false;
        grid2[cr][cc]=0;
        grid1[cr][cc]=0;
        for(int[] dir: directions){
            if(!is_sub_island(grid1,grid2, cr+dir[0],cc+dir[1])){
                grid2[cr][cc]=1;
                grid1[cr][cc]=1;
                return false;
            }
        }
        return true;
    }
}