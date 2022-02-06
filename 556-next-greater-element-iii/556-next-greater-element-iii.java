class Solution {
    public int nextGreaterElement(int n) {
        int[] nums=toArray(n);
        int len=nums.length;
        int curr=len-2;
        while(curr>-1 && nums[curr]>=nums[curr+1]) curr--;
        if(curr==-1) return -1;
        int temp=len-1;
        while(temp>curr && nums[temp]<=nums[curr]) temp--;
        swap(nums,curr,temp);
        // System.out.println(Arrays.toString(nums)+" "+curr+" "+temp);
        reverse(nums,curr+1);
        // System.out.println(Arrays.toString(nums)+" "+curr+" "+temp);
        curr=0;
        long ans=0;
        while(curr<len) ans=ans*10+nums[curr++];
        return (ans>Integer.MAX_VALUE)?-1:(int)ans;
    }
    
    public void reverse(int[] nums,int start){
        int m=(nums.length-start)/2;
        for(int i=0;i<m;i++){
            swap(nums,start+i,nums.length-1-i);
        }
    }
    
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public int[] toArray(int n){
        int d=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            d++;
        }
        int[] nums=new int[d];
        temp=n;
        while(temp>0){
            d--;
            nums[d]=temp%10;
            temp/=10;    
        }
        return nums;
    }
}