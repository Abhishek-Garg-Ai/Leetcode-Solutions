class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left=0,right=matrix[0].length-1,down=matrix.length-1;
        int dir=0;
        ArrayList<Integer> result=new ArrayList<>();
        while(left<=right && top<=down){
            if(dir==0){
                for(int i=left;i<=right;i++) result.add(matrix[top][i]);
                top+=1;
                dir=1;
            }else if(dir==1){
                for(int i=top;i<=down;i++) result.add(matrix[i][right]);
                right-=1;
                dir=2;
            }else if(dir==2){
                for(int i=right;i>=left;i--) result.add(matrix[down][i]);
                down-=1;
                dir=3;
            }else if(dir==3){
                for(int i=down;i>=top;i--) result.add(matrix[i][left]);
                left+=1;
                dir=0;
            }
        }
        return result;
    }
}