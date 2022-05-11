class Solution {
    public int countVowelStrings(int n) {
        return helper(n,0);
    }
    
    public int helper(int n,int curr_vowel){
        if(n==0) return 1;
        if(n<0) return 0;
        int ans=0;
        for(int i=curr_vowel;i<5;i++) ans+=helper(n-1,i);
        return ans;
    }
}