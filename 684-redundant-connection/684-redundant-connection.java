class Solution {
    int[] parent;
    int[] rank;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        for(int i=0;i<=n;i++) parent[i]=i;
        rank=new int[n+1];
        for(int[] edge: edges){
            if(find(edge[0])==find(edge[1])) return edge;
            union(edge[0],edge[1]);
        }
        return new int[]{-1,-1};
    }
    
    public void union(int u, int v){
        int u_p=find(u);
        int v_p=find(v);
        if(rank[u_p]<rank[v_p]) parent[u_p]=v_p;
        if(rank[u_p]>=rank[v_p]) parent[v_p]=u_p;
        if(rank[u_p]==rank[v_p]) u_p+=1;
    }
    
    public int find(int node){
        if(node==parent[node]) return node;
        return parent[node]=find(parent[node]);
    }
}