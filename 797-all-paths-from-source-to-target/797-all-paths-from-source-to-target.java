class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result=new ArrayList<>();
        ArrayList<Integer> lt=new ArrayList<Integer>();
        lt.add(0);
        helper(graph,0,lt);
        return result;
    }
    
    public void helper(int[][] graph,int curr, ArrayList<Integer> lt){
        if(curr==graph.length-1) result.add(new ArrayList<Integer>(lt));
        for(int i=0;i<graph[curr].length;i++){
                lt.add(graph[curr][i]);
                helper(graph,graph[curr][i],lt);
                lt.remove(lt.size()-1);
        }
    }
}