class Solution {
    public void gameOfLife(int[][] board) {
        int[][] helper=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count=live_neighbors(board,i,j);
                helper[i][j]=count;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count=helper[i][j];
                if(board[i][j]==1){
                    if(count!=3 && count!=4) board[i][j]=0;
                }else{
                    if(count==3) board[i][j]=1;
                }
            }
        }
    
    }
    
    public int live_neighbors(int[][] board, int cr, int cc){
        int ans=0;
        for(int i=Math.max(0,cr-1);i<=Math.min(board.length-1,cr+1);i++){
            for(int j=Math.max(0,cc-1);j<=Math.min(board[0].length-1,cc+1);j++)
                ans+=board[i][j];
        }
        return ans;
    }
}