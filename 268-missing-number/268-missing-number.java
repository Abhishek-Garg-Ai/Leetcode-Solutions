class Solution {
    public int missingNumber(int[] nums) {
        int s= nums.length*(nums.length+1)/2;
        for(int num:nums) s-=num;
        return s;
        
    }
}