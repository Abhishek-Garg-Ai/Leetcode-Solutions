class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int left=0;
        int right=n-1;
        int start=0;
        int end=n-1;
        int curr=1;
        int dir=1;
        while(left<=right && start<=end){
            if(dir==1){
                for(int i=left;i<=right;i++)
                    matrix[start][i]=curr++;
                start+=1;
                dir=2;
            }else if(dir==2){
                for(int i=start;i<=end;i++)
                    matrix[i][right]=curr++;
                dir=3;
                right-=1;
            }else if(dir==3){
                for(int i=right;i>=left;i--)
                    matrix[end][i]=curr++;
                dir=4;
                end-=1;
            }else if(dir==4){
                for(int i=end;i>=start;i--)
                    matrix[i][left]=curr++;
                dir=1;
                left+=1;
            }
        }
        return matrix;
    }
}