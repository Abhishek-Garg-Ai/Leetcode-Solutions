class Solution {
    public int minimumLines(int[][] stock_price) {
        if(stock_price.length==1) return 0;
        Arrays.sort(stock_price,(a,b)->a[0]-b[0]);
        int ans=1;
        double prev_slope=slope(stock_price[0],stock_price[1]);
        int curr=2;
        while(curr<stock_price.length){
            double curr_slope=slope(stock_price[curr-1],stock_price[curr]);
            if(curr_slope!=prev_slope){
                ans+=1;
                prev_slope=curr_slope;
            }
            curr+=1;
        }
        return ans;
    }
    
    public double slope(int[] a, int[] b){
        return (double)(b[1]*100-a[1]*100)/(double)(b[0]-a[0]);
    }
}