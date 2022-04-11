class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        k=k%(m*n);
        int[][] result=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[((k+j)/m+i)%n][(k+j)%m]=grid[i][j];
            }
        }
        return (List)Arrays.asList(result);    
    }
}