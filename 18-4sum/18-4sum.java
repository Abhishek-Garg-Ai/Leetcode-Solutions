class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int p1=0;
        while(p1<nums.length-3){
            int p2=p1+1;
            while(p2<nums.length-2){
                int s=target-nums[p1]-nums[p2];
                int p3=p2+1;
                int p4=nums.length-1;
                while(p3<p4){
                    int ns=nums[p3]+nums[p4];
                    if(ns<s) p3++;
                    else if(ns>s) p4--;
                    else{
                        ArrayList<Integer> l=new ArrayList<>();
                        l.add(nums[p1]);
                        l.add(nums[p2]);
                        l.add(nums[p3]);
                        l.add(nums[p4]);
                        result.add(l);
                        while(p3<p4 && nums[p3]==nums[p3+1]) p3++;
                        while(p3<p4 && nums[p4]==nums[p4-1]) p4--;
                        p3++;
                        p4--;
                    }
                }
                while(p2<nums.length-1 && nums[p2]==nums[p2+1]) p2++;
                p2++;
            }
            while(p1<nums.length-1 && nums[p1]==nums[p1+1]) p1++;
            p1++;
        }
        return result;
    }
    
    // public void k_sum(int[] nums)
}