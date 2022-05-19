class Solution {
    public int minMoves(int[] nums) {
        int inc = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            int a = nums[i];
            int b= nums[i+1] + inc;
            inc += b - a;
            nums[i+1] += inc - (b-a);
        }
        return inc;
    }
}