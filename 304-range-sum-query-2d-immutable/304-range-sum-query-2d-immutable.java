class NumMatrix {
    int[][] dp;
    public NumMatrix(int[][] mat) {
        if(mat.length==0 || mat[0].length==0) return;
        dp=new int[mat.length][mat[0].length+1];
        //row-wise prefix sum
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++)
                dp[i][j+1]=mat[i][j]+dp[i][j];
        // System.out.println(Arrays.deepToString(dp));
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1;i<=row2;i++){
            sum+=dp[i][col2+1]-dp[i][col1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */