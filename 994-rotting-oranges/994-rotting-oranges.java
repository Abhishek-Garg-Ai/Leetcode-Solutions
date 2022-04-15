class Solution {
    public int orangesRotting(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,helper(grid,i,j));
                }
            }
        }
        if(ans>=101) return -1;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]==1) return -1;
        //     }
        // }
        return ans;
    }
    
    public int helper(int[][] grid, int cr,int cc){
        if(cr<0 || cc<0 || cr>=grid.length || cc>= grid[0].length || grid[cr][cc]==0) return 101;
        if(grid[cr][cc]==2) return 0;
        int mins=101;
        grid[cr][cc]=0;
        mins=Math.min(mins,helper(grid,cr+1,cc));
        mins=Math.min(mins,helper(grid,cr-1,cc));
        mins=Math.min(mins,helper(grid,cr,cc+1));
        mins=Math.min(mins,helper(grid,cr,cc-1));
        grid[cr][cc]=1;
        return mins+1;
    }
}