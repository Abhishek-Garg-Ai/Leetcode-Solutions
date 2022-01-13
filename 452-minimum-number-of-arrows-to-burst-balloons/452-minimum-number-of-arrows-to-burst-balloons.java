class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int count=1;
        int index=1;
        int curr=0;
        while(index<points.length){
            if(points[index][0]>points[curr][1]){
                count+=1;
                curr=index;
            }
            index+=1;
        }
        // System.out.println(Arrays.deepToString(points));
        return count;
    }
}