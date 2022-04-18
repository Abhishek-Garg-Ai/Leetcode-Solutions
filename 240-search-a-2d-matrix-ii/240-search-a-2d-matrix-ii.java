class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(col>-1 && row<matrix.length){
            if(matrix[row][col]>target) col-=1;
            else if(matrix[row][col]<target) row+=1;
            else return true;
        }
        return false;
    }
}