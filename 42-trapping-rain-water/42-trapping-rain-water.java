class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] right_max=new int[n];
        int max=0;
        for(int i=n-1;i>=0;i--){
            right_max[i]=max;
            if(height[i]>max) max=height[i];
        }
        int left_max=0;
        int total=0;
        for(int i=0;i<n;i++){
            int capacity=Math.min(left_max,right_max[i])-height[i];
            if(capacity>0) total+=capacity;
            if(left_max<height[i]) left_max=height[i];
        }
        return total;
    }
}