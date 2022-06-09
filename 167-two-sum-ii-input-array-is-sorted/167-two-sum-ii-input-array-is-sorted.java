class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1=0;
        int p2=nums.length-1;
        while(p1<p2){
            int s=nums[p1]+nums[p2];
            if(s<target) p1++;
            else if(s>target) p2--;
            else return new int[]{p1+1,p2+1};
        }
        return new int[]{-1,-1};
    }
}