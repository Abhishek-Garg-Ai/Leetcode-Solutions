public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // System.out.println(n);
        int c=0;
        int mask=1;
        for (int i=0;i<32;i++){
            // System.out.println(n);
            if((mask & n)!=0) c+=1;
            mask=mask << 1;
        }
        return c;
    }
}