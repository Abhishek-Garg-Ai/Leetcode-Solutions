class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> lt=new ArrayList<>();
        int[] curr=intervals[0];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=curr[1]) 
                curr[1]=Math.max(curr[1],intervals[i][1]);
            else{
                lt.add(curr);
                curr=intervals[i];
            }
        }
        lt.add(curr);
        return lt.toArray(new int[lt.size()][]);
    }
}