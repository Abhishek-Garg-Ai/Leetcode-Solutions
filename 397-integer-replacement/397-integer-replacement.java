class Solution {
    public int integerReplacement(int n) {
        return helper(n);
    }
    
    public int helper(int n){
        if(n<=1) return 0;
        if(n%2==0) return 1+helper(n/2);
        if(n==Integer.MAX_VALUE) return helper(n-1);
        return 1+Math.min(helper(n+1),helper(n-1));
    }
}