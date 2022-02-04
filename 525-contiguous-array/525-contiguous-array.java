class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max_len=0;
        int curr=0;
        int p1=0;
        int p2=0;
        while(curr<nums.length){
            if(nums[curr]==0) p1+=1;
            else p2+=1;
            int diff=p1-p2;
            if(map.containsKey(diff)) max_len=Math.max(max_len,curr-map.get(diff));
            else map.put(diff,curr);
            curr++;
        }
        return max_len;
        
    }
}