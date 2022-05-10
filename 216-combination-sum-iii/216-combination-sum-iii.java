class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum3(int k, int n) {
        result=new ArrayList<>();
        ArrayList<Integer> lt=new ArrayList<>();
        for(int i=1;i<=9;i++){
            lt.add(i);
            helper(i,k-1,n-i,lt);
            lt.remove(lt.size()-1);
        }
        return result;
    }
    
    public void helper(int curr,int k,int sum, ArrayList<Integer> lt){
        if(k==0 && sum==0){
            result.add(new ArrayList<>(lt));
            return;
        }
        if(k<=0 || sum<0) return;
        for(int i=curr+1;i<=9;i++){
            lt.add(i);
            helper(i,k-1,sum-i,lt);
            lt.remove(lt.size()-1);
        }
    }
}