class Solution {
    public int minAddToMakeValid(String s) {
        int open_c=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open_c+=1;
            else{
                if(open_c==0) count+=1;
                else open_c-=1;
            }
        }
        count+=open_c;
        return count;
    }
}