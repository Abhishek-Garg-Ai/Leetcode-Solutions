class Solution {
    List<String> result;
    HashMap<Character,String> map;
    public List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
        map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        helper(digits,0, "");
        return result;
    }
    
    public void helper(String digits, int curr, String res){
        if(curr==digits.length()){
            if(!res.equals(""))result.add(res);
            return;
        }
        char ch=digits.charAt(curr);
        for(int i=0;i<map.get(ch).length();i++){
            helper(digits,curr+1,res+map.get(ch).charAt(i));
        }
    }
    
    
    
    
}