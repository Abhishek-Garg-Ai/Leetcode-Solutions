class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int tank=0;
        int index=0;
        int curr=0;
        while(curr<gas.length){
            int consume=gas[curr]-cost[curr];
            tank+=consume;
            if(tank<0){
                index=curr+1;
                tank=0;
            }
            total+=consume;
            curr+=1;
        }
        return (total<0)?-1:index;
            
    }
}