class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int curr=0;
        Arrays.fill(nge,-1);
        int itr=0;
        while(itr<2 && curr<nums.length){
            while(st.isEmpty()==false && nums[st.peek()]<nums[curr]) nge[st.pop()]=nums[curr];
            st.push(curr++);
            if(curr==nums.length){
                itr+=1;
                curr=0;
            }
        }
        return nge;
    }
}