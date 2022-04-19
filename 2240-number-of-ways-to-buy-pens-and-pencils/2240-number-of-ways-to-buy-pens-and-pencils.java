class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int c1=total/cost1;
        long ans=0;
        for(int i=0;i<c1+1;i+=1){
            int curr=total-i*cost1;
            ans+=(curr/cost2)+1;
        }
        return ans;
    }
    

}