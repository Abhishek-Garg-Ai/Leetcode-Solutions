class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i=1;
        // move i until we get our first unsorted elememt(from left)
        while(i<nums.length && nums[i]>=nums[i-1]) i+=1;
        if(i==nums.length) return 0;
        int min=nums[i];
        for(int j=i+1;j<nums.length;j++) min=Math.min(min,nums[j]);
        for(int j=0;j<i;j++){
            if(nums[j]>min){
                min=j;
                break;
            }
        }
        // move i until we get our first unsorted elememt(from right)
        i=nums.length-2;
        while(i>-1 && nums[i]<=nums[i+1]) i-=1;
        int max=nums[i];
        for(int j=0;j<i;j++) max=Math.max(max,nums[j]);
        //min: minimum value from the unsorted array
        //max: maximum value from the unsorted array
        for(int j=nums.length-1;j>i;j--){
            if(nums[j]<max){
                max=j;
                break;
            }
        }
        // System.out.println(min+" "+max);
        return max-min+1;
    }
}