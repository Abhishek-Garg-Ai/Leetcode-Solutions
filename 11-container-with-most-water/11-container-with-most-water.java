class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int ans=0;
        while(p1<p2){
            ans=Math.max(ans,Math.min(height[p1],height[p2])*(p2-p1));
            if(height[p1]<height[p2]) p1++;
            else p2--;
        }
        return ans;
        
    }
}