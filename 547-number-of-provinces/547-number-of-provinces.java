class Solution {
    int[] parent;
    int[] rank;
    public int findCircleNum(int[][] mat) {
        int n=mat.length;
        parent=new int[n];
        // each node is parent of itself
        for(int i=0;i<n;i++) parent[i]=i;
        rank=new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1) union(i,j);
            }
        }
        for(int i=0;i<n;i++) find(i);
        
        HashSet<Integer> s=new HashSet<>();
        for(int repr:parent) s.add(repr);
        return s.size();
    }
    
    public int find(int node){
        if(node==parent[node]) return node;
        return parent[node]=find(parent[node]);// path compression
    }
    
    public void union(int u, int v){
        int u_p=find(u);
        int v_p=find(v);
        if(u_p==v_p) return;
        if(rank[u_p]<rank[v_p]) parent[u_p]=v_p;
        if(rank[u_p]>rank[v_p]) parent[v_p]=u_p;
        if(rank[u_p]==rank[v_p]){
            parent[u_p]=v_p;
            rank[v_p]+=1;
        }
        
    }
    
    
    
    
    
}