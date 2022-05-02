class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result=new ArrayList<>();
        Deque<Integer> lt=new ArrayDeque<>();
        lt.add(0);
        helper(graph,0,lt);
        return result;
    }
    
    public void helper(int[][] graph,int curr, Deque<Integer> lt){
        if(curr==graph.length-1) result.add(new ArrayList<Integer>(lt));
        for(int i=0;i<graph[curr].length;i++){
                lt.addLast(graph[curr][i]);
                helper(graph,graph[curr][i],lt);
                lt.pollLast();
        }
    }
}