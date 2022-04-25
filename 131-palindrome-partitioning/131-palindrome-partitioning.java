class Solution {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        result=new ArrayList<>();    
        ArrayList<String> lt=new ArrayList<>();
        helper(s,lt,0);
        return result;
    }
    
    public void helper(String s,ArrayList<String> partitions,int start){
        if(start>=s.length()) result.add(new ArrayList<String>(partitions));

        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                partitions.add(s.substring(start,end+1));
                helper(s,partitions,end+1);
                partitions.remove(partitions.size()-1);
            }
        }
        
    }
    
    
    public boolean isPalindrome(String s,int low, int high){
        while(low<high){
            if(s.charAt(low++)!=s.charAt(high--)) return false;
        }
        return true;
    }
}