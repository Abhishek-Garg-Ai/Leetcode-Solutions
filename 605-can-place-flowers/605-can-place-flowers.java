class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int size=flowerbed.length;
        for(int i=0;i<size;i++){
            if((i==0 || flowerbed[i-1]!=1) && flowerbed[i]==0 && (i==size-1 || flowerbed[i+1]!=1)){
                flowerbed[i]=1;
                count+=1;
            }
        }
        // if(flowerbed[size-1]==0 && flowerbed[size-2]==0) count+=1;
        if(count>=n) return true;
        return false;
    }
}