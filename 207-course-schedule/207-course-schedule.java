class Solution {
    //find cycle
    public boolean canFinish(int n, int[][] prereq) {
        int[] in_degree=new int[n];
        ArrayList<ArrayList<Integer>> lt=new ArrayList<>();
        for(int i=0;i<n;i++) lt.add(new ArrayList<Integer>());
        for(int[] edge: prereq){
            in_degree[edge[0]]+=1;
            lt.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
            if(in_degree[i]==0)
                q.add(i);
        int count=0;
        while(!q.isEmpty()){
            count+=1;
            int curr=q.poll();
            for(int u: lt.get(curr)){
                in_degree[u]-=1;
                if(in_degree[u]==0) q.offer(u);
            }
        }
        return count==n;
    }
}