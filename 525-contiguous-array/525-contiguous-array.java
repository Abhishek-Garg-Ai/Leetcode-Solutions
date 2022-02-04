class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max_len=0;
        int s=0;
        int p2=0;
        while(p2<nums.length){
            s+=nums[p2];
            if(map.containsKey(s)) max_len=Math.max(max_len,p2-map.get(s));
            else map.put(s,p2);
            p2++;
        }
        return max_len;
        
    }
}