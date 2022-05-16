class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1) return -1;
        Queue<int[]> q=new LinkedList<>();
        int[][] dir={{1,1},{1,-1},{-1,1},{-1,-1},{1,0},{0,1},{-1,0},{0,-1}};
        q.offer(new int[]{0,0,0});
        grid[0][0]=1;
        while(!q.isEmpty()){
            int s=q.size();
            while(s>0){
                int[] curr=q.poll();
                if(curr[0]==n-1 && curr[1]==n-1) return curr[2]+1;
                for(int[] d: dir){
                    int r=curr[0]+d[0];
                    int c=curr[1]+d[1];
                    if(r>=0 && c>=0 && r<n && c<n && grid[r][c]==0){
                        q.offer(new int[]{r,c,curr[2]+1});
                        grid[r][c]=1;
                    }
                }
                s-=1;
            }
        }
        return -1;
    }
}