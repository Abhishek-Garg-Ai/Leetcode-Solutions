class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++) Arrays.fill(dp[i],-1);
        return helper(word1,word2,0,0);
    }
    
    public int helper(String word1,String word2,int c1,int c2){
        if(c1==word1.length() && c2==word2.length()) return 0;
        else if(c1==word1.length()) return (word2.length()-c2);
        else if(c2==word2.length()) return (word1.length()-c1);
        else if(dp[c1][c2]!=-1) return dp[c1][c2];
        else if(word1.charAt(c1)==word2.charAt(c2)) 
            return dp[c1][c2]=helper(word1,word2,c1+1,c2+1);
        int m= helper(word1,word2,c1+1,c2);//delete
        m=Math.min(m,helper(word1,word2,c1,c2+1));//insert
        m=Math.min(m,helper(word1,word2,c1+1,c2+1));//replace
        return dp[c1][c2]=m+1;
    }
}