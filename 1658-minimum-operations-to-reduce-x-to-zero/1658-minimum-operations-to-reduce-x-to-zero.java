class Solution {
    HashMap<Integer, Integer> map=new HashMap<>();
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(sum,i);
        }
        if(x>sum) return -1;
        map.put(0,-1);
        int longest=0;
        sum-=x;
        int curr_s=0;
        for(int i=0;i<nums.length;i++){
            curr_s+=nums[i];
            if(map.containsKey(curr_s-sum)) 
                longest=Math.max(longest,i-map.get(curr_s-sum));
        }
        return longest==0?(sum==0?nums.length:-1):nums.length-longest;
        
        
    }
}