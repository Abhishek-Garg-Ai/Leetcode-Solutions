class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<points.length;i++)
            map.put(i,points[i]);
        HashSet<Integer> set=new HashSet<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[2]-b[2]);
        pq.add(new int[]{0,0,0});
        int ans=0;
        while(!pq.isEmpty() && set.size()<points.length){
            int[] curr=pq.poll();
            if(set.contains(curr[1])) continue; 
            ans+=curr[2];
            set.add(curr[1]);
            for(int i=0;i<points.length;i++){
                if(!set.contains(i))
                pq.add(new int[]{curr[1],i,dist(map.get(curr[1]),map.get(i))});
            }
        }
        return ans;
    }
    
    public int dist(int[] a, int[] b){
        return Math.abs(a[0]-b[0])+Math.abs(a[1]-b[1]);
    }
}