class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int count=1;
        int index=1;
        int curr=0;
        for(int i=1;i<points.length;i++){
            if(i==0 || points[i][0]>points[curr][1]){
                count+=1;
                curr=i;
            }
        }
        // System.out.println(Arrays.deepToString(points));
        return count;
    }
}