class Solution {
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result=new ArrayList<>();
        helper(n,n,"");
        return result;
    }
    
    public void helper(int left_open, int left_close, String str){
        if(left_open==0 && left_close==0){
            result.add(str);
            return;
        }
        if(left_open>0) helper(left_open-1,left_close,str+'(');
        if(left_close>0 && left_close>left_open) helper(left_open,left_close-1,str+')');
        
    }
    
}