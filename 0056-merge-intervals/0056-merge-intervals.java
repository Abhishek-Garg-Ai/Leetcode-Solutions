class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        // System.out.println(Arrays.deepToString(intervals));
        ArrayList<int[]> lt=new ArrayList<>();
        int[] curr=intervals[0];
        int i=1;
        while(i<intervals.length){
            if(intervals[i][0]<=curr[1]) 
                curr[1]=Math.max(curr[1],intervals[i++][1]);
            else{
                lt.add(curr);
                curr=intervals[i++];
            }
        }
        lt.add(curr);
        // int[] arr = new int[lt.size()]; 
        return lt.toArray(new int[0][]);
        // return lt.toArray(arr);
        // return intervals;
    }
}