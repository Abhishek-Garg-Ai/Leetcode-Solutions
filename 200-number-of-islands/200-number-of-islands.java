class Solution {
    public int numIslands(char[][] grid) {
        int islands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    islands+=1;
                    visitIsland(grid,i,j);
                }
            }
        }
        return islands;
    }
    
    public void visitIsland(char[][] grid, int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!='1') return;
        grid[r][c]='0';
        visitIsland(grid,r+1,c);
        visitIsland(grid,r-1,c);
        visitIsland(grid,r,c+1);
        visitIsland(grid,r,c-1);
    }
}