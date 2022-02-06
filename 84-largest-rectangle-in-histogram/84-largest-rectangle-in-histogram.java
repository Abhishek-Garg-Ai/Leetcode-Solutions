class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse_arr=pse(heights);
        int[] nse_arr=nse(heights);
        int max=0;
        // System.out.println(Arrays.toString(pse_arr));
        // System.out.println(Arrays.toString(nse_arr));
        for(int i=0;i<heights.length;i++){
            int dist=(i-pse_arr[i])+(nse_arr[i]-i-1);
            max=Math.max(max,dist*heights[i]);
        }
        return max;
    }
    
    public int[] nse(int[] nums){
        int[] arr=new int[nums.length];
        int curr=0;
        Arrays.fill(arr,nums.length);
        Stack<Integer> st=new Stack<Integer>();
        while(curr<nums.length){
            while(st.isEmpty()==false && nums[curr]<nums[st.peek()]) arr[st.pop()]=curr;
            st.push(curr++);
        }
        return arr;
    }
    
    public int[] pse(int[] nums){
        int[] arr=new int[nums.length];
        int curr=nums.length-1;
        Arrays.fill(arr,-1);
        Stack<Integer> st=new Stack<>();
        while(curr>-1){
            while(st.isEmpty()==false && nums[curr]<nums[st.peek()]) arr[st.pop()]=curr;
            st.push(curr--);
        }
        return arr;
    }
    
}