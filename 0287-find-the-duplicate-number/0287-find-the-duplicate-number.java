class Solution {
    public int findDuplicate(int[] nums) {
        int curr=nums[0];
        while(true){
            if(nums[curr]<0) return curr;
            nums[curr]*=-1;
            curr=Math.abs(nums[curr]);
        }
    }
}