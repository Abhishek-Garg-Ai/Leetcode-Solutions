class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans+=1;
                    helper(grid,i,j);
                }
            }
        }
        return ans;
    }
    
    public void helper(char[][] grid, int cr,int cc){
        if(cr>=grid.length || cr<0 || cc>=grid[0].length || cc<0 || grid[cr][cc]=='0') return;
        grid[cr][cc]='0';
        helper(grid,cr+1,cc);
        helper(grid,cr-1,cc);
        helper(grid,cr,cc+1);
        helper(grid,cr,cc-1);
    }
}