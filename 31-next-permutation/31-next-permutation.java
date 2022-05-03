class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int curr=n-2;
        while(curr>-1 && nums[curr]>=nums[curr+1]) curr--;
        if(curr==-1){
            reverse(nums,0);
            return;
        }
        int temp=n-1;
        while(temp>curr && nums[curr]>=nums[temp]) temp--;
        swap(nums,curr,temp);
        reverse(nums,curr+1);
        
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
    public void reverse(int[] nums,int start){
        for(int i=0;i<(nums.length-start)/2;i++){
            int temp=nums[start+i];
            nums[start+i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
    }
}