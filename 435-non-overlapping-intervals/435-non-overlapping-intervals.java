class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> {
            if(a[1] == b[1])
                return a[0] - b[0];
            else return a[1] - b[1];
        });
        // System.out.println(Arrays.deepToString(intervals));
        int i = 0;
        int ret = 0;
        while(i < intervals.length) {
            int end = intervals[i][1];
            i++;
            while(i < intervals.length && intervals[i][0] < end) {
                i++;
                ret++;
            }
        }
        return ret;
    }
}