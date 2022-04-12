class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count=live_neighbors(board,i,j);
                if(board[i][j]==1){
                    if(count!=3 && count!=4) board[i][j]=2;
                }else{
                    if(count==3) board[i][j]=-1;
                }
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==2) board[i][j]=0;
                else if(board[i][j]==-1) board[i][j]=1;
                
            }
        }
    
    }
    
    public int live_neighbors(int[][] board, int cr, int cc){
        int ans=0;
        for(int i=Math.max(0,cr-1);i<=Math.min(board.length-1,cr+1);i++){
            for(int j=Math.max(0,cc-1);j<=Math.min(board[0].length-1,cc+1);j++)
                if(board[i][j]==1 || board[i][j]==2) ans+=1;
        }
        return ans;
    }
}