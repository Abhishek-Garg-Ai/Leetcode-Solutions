class Solution {
    // boolean[][] dp;
    public int countSubstrings(String s) {
        int n=s.length();
        // dp=new boolean[n][n];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(helper(s,i,j)) ans+=1;
            }
        }
        return ans;
        
    }
    
    public boolean helper(String s,int i,int j){
        if(i==j) return true; // single char
        if(j==i+1) return s.charAt(i)==s.charAt(j); //double char
        if(j<i) return false;
        if(s.charAt(i)==s.charAt(j)) return helper(s,i+1,j-1);
        return false;
    }
}