class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans=new int[encoded.length+1];
        ans[0]=first;
        for(int i=0;i<encoded.length;i++){
            first=first^encoded[i];
            ans[i+1]=first;
        }
        return ans;
    }
}