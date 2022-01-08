class Solution {
    public int trap(int[] height) {
        int[] right_max=new int[height.length];
        int max=0;
        for(int i=height.length-1;i>=0;i--){
            right_max[i]=max;
            if(height[i]>max) max=height[i];
        }
        int left_max=0;
        int total=0;
        for(int i=0;i<height.length;i++){
            int capacity=Math.min(left_max,right_max[i])-height[i];
            if(capacity>0) total+=capacity;
            if(left_max<height[i]) left_max=height[i];
        }
        // System.out.println(Arrays.toString(right_max));
        return total;
        
    }
}