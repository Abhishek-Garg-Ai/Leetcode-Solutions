class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int min_i=nums.length;
        for(int i=0;i<nums.length;i++){
            while(st.size()>0 && nums[st.peek()]>nums[i])
                min_i=Math.min(min_i,st.pop());
            st.push(i);
        }
        st.clear();
        int max_i=0;
        for(int i=nums.length-1;i>-1;i--){
            while(st.size()>0 && nums[st.peek()]<nums[i])
                max_i=Math.max(max_i,st.pop());
            st.push(i);
        }
        // System.out.println(min_i+" "+max_i);
        return max_i-min_i>0?max_i-min_i+1:0;
    }
}