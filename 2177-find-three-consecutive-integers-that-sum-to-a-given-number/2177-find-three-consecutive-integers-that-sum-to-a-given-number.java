class Solution {
    public long[] sumOfThree(long num) {
        if((num)%3!=0) return new long[0];
        long s=(num-3)/3;
        return new long[]{s,s+1,s+2};
    }
}