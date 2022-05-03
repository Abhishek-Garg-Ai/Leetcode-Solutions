class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // first we try to find leftmost element which is unsorted
        // then we find the minimum element from the right of unsorted element.
        // find the correct position in the sorted part for the minimum element
        // now we know the correct starting index of the unsorted array.
        int i=1;
        while(i<nums.length && nums[i]>=nums[i-1]) i+=1;
        if(i==nums.length) return 0;
        int min=nums[i];
        for(int j=i+1;j<nums.length;j++) min=Math.min(min,nums[j]);
        for(int j=0;j<i;j++){
            if(nums[j]>min){
                min=j;// start
                break;
            }
        }
        // Now, we find rightmost element which is unsorted(reverse traversal)
        // search for the max element from the left of unsorted element.
        // find the correct position in the sorted part for the max element
        // we get the correct ending index of the unsorted array.
        i=nums.length-2;
        while(i>-1 && nums[i]<=nums[i+1]) i-=1;
        int max=nums[i];
        for(int j=0;j<i;j++) max=Math.max(max,nums[j]);
        for(int j=nums.length-1;j>i;j--){
            if(nums[j]<max){
                max=j;//end
                break;
            }
        }
        // length of the unsorted array will be start-end+1
        return max-min+1;
    }
}