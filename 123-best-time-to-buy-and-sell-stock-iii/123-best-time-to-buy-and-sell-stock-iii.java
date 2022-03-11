class Solution {
    public int maxProfit(int[] prices) {
        //
        int min=prices[0];
        int[] left=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            left[i]=Math.max(left[i-1],prices[i]-min);// profit till now, today's profit
            min=Math.min(min,prices[i]);
        }
        //
        int max=prices[prices.length-1];
        int[] right=new int[prices.length];
        for(int i=prices.length-2;i>-1;i--){
            right[i]=Math.max(right[i+1],max-prices[i]);
            max=Math.max(max,prices[i]);
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        int ans=0;
        for(int i=0;i<left.length;i++){
            ans=Math.max(ans,left[i]+right[i]);
        }
        return ans;
        
    }
}