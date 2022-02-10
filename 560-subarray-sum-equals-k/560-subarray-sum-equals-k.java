class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int total=0;
        int s=0;
        for(int curr=0;curr<nums.length;curr++){
            s+=nums[curr];
            total+=map.getOrDefault(s-k,0);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return total;
    }
}