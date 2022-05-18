class Solution {
    int[] color;
    boolean[] visited;
    public boolean isBipartite(int[][] graph) {
        color=new int[graph.length];
        visited=new boolean[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(!visited[i]) if(!bfs(graph,i)) return false;
        }
        return true;
    }
    
    public boolean bfs(int[][] graph, int s){
        Queue<Node> q=new LinkedList<>();
        q.offer(new Node(s,0));
        color[s]=0;
        while(!q.isEmpty()){
            Node curr=q.poll();
            visited[curr.val]=true;
            for(int u:graph[curr.val]){
               if(color[u]==curr.color) return false;
                if(color[u]==-1){
                    color[u]=1-curr.color;
                    q.offer(new Node(u,1-curr.color));
                }
            }
        }
        return true;
    }
    
    class Node{
        int val;
        int color;
        public Node(int val,int color){
            this.val=val;
            this.color=color;
        }
    }
}