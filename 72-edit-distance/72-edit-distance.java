class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        dp=new int[arr1.length][arr2.length];
        for(int i=0;i<arr1.length;i++) Arrays.fill(dp[i],-1);
        return helper(arr1,arr2,0,0);
    }
    
    public int helper(char[] arr1,char[] arr2,int c1,int c2){
        if(c1==arr1.length && c2==arr2.length) return 0;
        else if(c1==arr1.length) return (arr2.length-c2);
        else if(c2==arr2.length) return (arr1.length-c1);
        else if(dp[c1][c2]!=-1) return dp[c1][c2];
        else if(arr1[c1]==arr2[c2]) 
            return dp[c1][c2]=helper(arr1,arr2,c1+1,c2+1);
        int m= helper(arr1,arr2,c1+1,c2);//delete
        m=Math.min(m,helper(arr1,arr2,c1,c2+1));//insert
        m=Math.min(m,helper(arr1,arr2,c1+1,c2+1));//replace
        return dp[c1][c2]=m+1;
    }
}