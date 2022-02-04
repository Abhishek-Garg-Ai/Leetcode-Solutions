class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int curr=0;
        while(curr<nums2.length){
            while(st.isEmpty()==false && nums2[curr]>st.peek()) map.put(st.pop(),nums2[curr]);
            st.push(nums2[curr++]);
        }
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) result[i]=map.getOrDefault(nums1[i],-1);
        return result;
    }
    
}