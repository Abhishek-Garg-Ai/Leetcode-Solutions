class Solution {
    int[] p;
    public boolean validateBinaryTreeNodes(int n, int[] left, int[] right) {
        int[] parent=new int[n];
        p = new int[n];
        for(int i = 0; i < p.length; i++)
            p[i] = i;
        Arrays.fill(parent,-1);
        for(int i=0;i<n;i++){ 
            if(left[i] != -1) {
                if(parent[left[i]] != -1) return false;
                parent[left[i]]=i;
            }
            if(right[i] != -1) {
                if(parent[right[i]] != -1) return false;
                parent[right[i]]=i;
            }
        }
        int c=0;
        for(int i=0;i<n;i++) if(parent[i] == -1) c++;
        if(c!=1) return false;
        // System.out.println(Arrays.toString(parent));
        int root = -1;
        for(int i = 0; i < parent.length; i++) {
            if(parent[i] == -1) {
                root = i;
                continue;
            }
            union(i, parent[i]);
        }
        for(int i = 0; i < n; i++)
            find(i);
        for(int i = 0; i < p.length; i++)
            if(p[i] != root)
                return false;
        return true;
        
    }
    
    
    public void union(int a, int b) {
        p[find(a)] = find(b);
    }
    
    public int find(int a) {
        if(p[a] == a)
            return a;
        return p[a] = find(p[a]);
    }
}