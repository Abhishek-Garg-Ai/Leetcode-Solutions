class Solution {
    public double myPow(double x, int n) {
        double ans=helper(x,n);
        if(n<0) return 1/ans;
        return ans;
    }
    
    public double helper(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        double ans=helper(x,n/2);
        if(n%2==0) return ans*ans;
        return (ans*x)*(ans);
    }
}