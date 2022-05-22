class Solution {
    public int minimumLines(int[][] stock_price) {
        Arrays.sort(stock_price,(a,b)->a[0]-b[0]);
        int ans=0;
        double prev_slope=0.0;
        int curr=1;
        while(curr<stock_price.length){
            double curr_slope=slope(stock_price[curr-1],stock_price[curr]);
            // System.out.println(prev_slope+" "+curr_slope);
            if(curr_slope!=prev_slope || (curr_slope==0 && ans==0)){
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