class Solution {
    boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(isConnected,i);
                count+=1;
            }
        }
        return count;
    }
    
    public void dfs(int[][] mat,int curr){
        visited[curr]=true;
        for(int i=0;i<mat.length;i++){
            if(!visited[i] && mat[curr][i]==1){
                dfs(mat,i);
            }
        }
    }
}