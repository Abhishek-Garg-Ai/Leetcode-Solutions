class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int total=0;
        int curr=0;
        int s=0;
        while(curr<nums.length){
            s+=nums[curr++];
            total+=map.getOrDefault(s-k,0);
            map.put(s,map.getOrDefault(s,0)+1);
            // set.add(s);
        }
        // if(k==0) total+=1;
        return total;
    }
}