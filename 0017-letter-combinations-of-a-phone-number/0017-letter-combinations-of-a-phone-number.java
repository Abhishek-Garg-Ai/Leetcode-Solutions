class Solution {
    String[] arr=new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> result;
    public List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
        if(digits.length()==0) return result;
        helper(digits,0, "");
        return result;
    }
    
    public void helper(String str, int curr, String comb){
        if(curr==str.length()) result.add(comb);
        if(curr>=str.length()) return;
        String letters=arr[str.charAt(curr)-'2'];
        for(char ch: letters.toCharArray()){
            helper(str,curr+1,comb+ch);
        }
    }
}