class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area=visitIsland(grid,i,j);
                    if(area>max_area) max_area=area;
                }
            }
        }
        return max_area;
    
    }
    
    public int visitIsland(int[][] grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return 0;
        grid[r][c]=0;
        int area=1;
        area+=visitIsland(grid,r+1,c);
        area+=visitIsland(grid,r-1,c);
        area+=visitIsland(grid,r,c+1);
        area+=visitIsland(grid,r,c-1);
        return area;
    }
    
    
    
}