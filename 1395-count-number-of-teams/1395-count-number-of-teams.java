class Solution {
    int[][] dp;
    public int numTeams(int[] rating) {
        dp=new int[rating.length+1][4];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        int ans=0;
        for(int i=0;i<rating.length-2;i++) ans+=helper_increasing(rating,i,1);
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        for(int i=0;i<rating.length-2;i++) ans+=helper_decreasing(rating,i,1);
        return ans;
    }
    
    public int helper_increasing(int[] rating, int curr, int num){
        if(num==3) return 1;
        if(curr>rating.length) return 0;
        if(dp[curr][num]!=-1) return dp[curr][num];
        int ans=0;
        for(int i=curr+1;i<rating.length;i++){
            if(rating[i]>rating[curr]){
                ans+=helper_increasing(rating,i,num+1);
            }
        }
        return dp[curr][num]=ans;
    }

    public int helper_decreasing(int[] rating, int curr, int num){
        if(num==3) return 1;
        if(curr>rating.length) return 0;
        if(dp[curr][num]!=-1) return dp[curr][num];
        int ans=0;
        for(int i=curr+1;i<rating.length;i++){
            if(rating[i]<rating[curr]){
                ans+=helper_decreasing(rating,i,num+1);
            }
        }
        return dp[curr][num]=ans;
    }
}