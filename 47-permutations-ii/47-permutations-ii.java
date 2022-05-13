class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> permuteUnique(int[] nums) {
        results = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);
        LinkedList<Integer> lt=new LinkedList<>();
        helper(nums.length,map,lt);
        return results;
    }
    
    public void helper(int N, HashMap<Integer,Integer> map, LinkedList<Integer> lt){
        if(lt.size()==N){
            results.add(new ArrayList<>(lt));
            return;
        }
        for(int key:map.keySet()){
            if(map.get(key)>0){
                int val=map.get(key);
                lt.add(key);
                map.put(key,val-1);
                helper(N,map,lt);
                lt.remove(lt.size()-1);
                map.put(key,val);
            }
        }
    }

}