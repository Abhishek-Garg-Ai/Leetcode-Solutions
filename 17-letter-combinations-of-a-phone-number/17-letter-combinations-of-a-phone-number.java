class Solution {
    List<String> result;
    // HashMap<Character,String> map;
    String[] map;
    public List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
        map=new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(digits,0, "");
        return result;
    }
    
    public void helper(String digits, int curr, String res){
        if(curr==digits.length()){
            if(!res.equals(""))result.add(res);
            return;
        }
        char ch=digits.charAt(curr);
        for(int i=0;i<map[(int)(ch-'2')].length();i++){
            helper(digits,curr+1,res+map[(int)(ch-'2')].charAt(i));
        }
    }
    
    
    
    
}