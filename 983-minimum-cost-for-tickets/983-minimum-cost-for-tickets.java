class Solution {
    int[] days,costs;
    int[] durations=new int[]{1,7,30};
    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        this.days=days;
        this.costs=costs;
        dp=new int[days.length];
        Arrays.fill(dp,-1);
        return helper(0);
    }
    
    public int helper(int curr_index){
        if(curr_index>=days.length) return 0;
        int m=1000000;
        int j=curr_index;
        if(dp[curr_index]!=-1) return dp[curr_index];
        for(int i=0;i<3;i++){
            while(j<days.length && days[j]<days[curr_index]+durations[i]) j++;
            m=Math.min(m,helper(j)+costs[i]);
        }
        return dp[curr_index]=m;
    }
    
}