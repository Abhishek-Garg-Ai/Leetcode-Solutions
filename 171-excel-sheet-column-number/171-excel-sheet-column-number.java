class Solution {
    public int titleToNumber(String columnTitle) {
        // int index=0;
        int ans=0;
        for(int i=columnTitle.length()-1;i>-1;i--){
            char ch=columnTitle.charAt(i);
            ans=ans+(int)Math.pow(26,columnTitle.length()-i-1)*(ch-64);
            // index+=1;
        }
        return ans;
    }
}