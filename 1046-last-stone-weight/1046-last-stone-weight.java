class Solution {
    public int lastStoneWeight(int[] stones) {
        int s=stones.length;
        while(s>1){
            Arrays.sort(stones);
            stones[stones.length-1]-=stones[stones.length-2];
            stones[stones.length-2]=-1;
            s-=1;
        }
        Arrays.sort(stones);
        return stones[stones.length-1];
    }
}