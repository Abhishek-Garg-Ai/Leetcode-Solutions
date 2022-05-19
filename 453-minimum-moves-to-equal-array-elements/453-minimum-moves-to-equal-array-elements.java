class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int p1=0;
        int p2=nums.length-1;
        int ans=0;
        while(p1<p2){
            ans+=(nums[p2--]-nums[p1]);    
        }
        return ans;

    }
}