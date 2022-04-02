class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i+=1;
            j-=1;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int p1=0;
        int p2=s.length()-1;
        while(p1<p2){
            if(s.charAt(p1)!=s.charAt(p2)) 
                return isPalindrome(s,p1,p2-1) || isPalindrome(s,p1+1,p2);
            p1+=1;
            p2-=1;
        }
        return true;
    }
}