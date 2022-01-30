class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> lt=new ArrayList<>();
        int curr=1;
        int s=intervals[0][0];
        int e=intervals[0][1];
        while(curr<intervals.length){
            if(intervals[curr][0]<=e) e=Math.max(intervals[curr][1],e);
            else{
                lt.add(new int[]{s,e});
                s=intervals[curr][0];
                e=intervals[curr][1];
            }
            curr+=1;
        }
        lt.add(new int[]{s,e});
        int[][] result=new int[lt.size()][2];
        for(int i=0;i<lt.size();i++) result[i]=lt.get(i);
        return result;
        

    }
}