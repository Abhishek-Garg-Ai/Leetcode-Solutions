class Solution {
    public int findDuplicate(int[] nums) {
        int curr=nums[0];
        while(true){
            if(nums[curr]==-1) return curr;
            int nxt=nums[curr];
            nums[curr]=-1;
            curr=nxt;
        }
    }
}