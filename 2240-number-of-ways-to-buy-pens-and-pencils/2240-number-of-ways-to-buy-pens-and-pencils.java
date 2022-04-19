class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int c1=total/cost1;
        int c2=total/cost2;
        long ans=0;
        for(int i=0;i<c1+1;i++){
            int curr=total-i*cost1;
            ans+=(curr/cost2)+1;
        }
        return ans;
    }
    

}