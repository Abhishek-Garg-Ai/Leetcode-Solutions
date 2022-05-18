class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] in_degree=new int[n];
        for(List<Integer> edge:edges)
            in_degree[edge.get(1)]++;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++) if(in_degree[i]==0) result.add(i);
        return result;
    }
}