class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result=new ArrayList<>();
        ArrayList<Integer> lt=new ArrayList<>();
        helper(nums,lt);
        return result;
    }
    public void helper(int[] nums, ArrayList<Integer> lt){
        if(lt.size()==nums.length){
            result.add(new ArrayList<>(lt));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!lt.contains(nums[i])){
                lt.add(nums[i]);
                helper(nums,lt);
                lt.remove(lt.size()-1);
            }
        }
    }
}