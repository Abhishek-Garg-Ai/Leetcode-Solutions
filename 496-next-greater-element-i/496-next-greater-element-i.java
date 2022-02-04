class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=nge(nums2);
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) result[i]=map.getOrDefault(nums1[i],-1);
        return result;
    }
    
    public HashMap<Integer,Integer> nge(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int curr=0;
        while(curr<arr.length){
            while(st.isEmpty()==false && arr[curr]>arr[st.peek()]) map.put(arr[st.pop()],arr[curr]);
            st.push(curr++);
        }
        return map;
    }
}