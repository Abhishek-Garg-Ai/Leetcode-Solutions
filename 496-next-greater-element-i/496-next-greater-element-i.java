class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++) map.put(nums2[i],i);
        int[] nge_arr=nge(nums2);
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) result[i]=nge_arr[map.get(nums1[i])];
        // System.out.println(Arrays.toString());
        return result;
    }
    
    public int[] nge(int[] arr){
        int[] nge_arr=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int curr=0;
        while(curr<arr.length){
            while(st.isEmpty()==false && arr[curr]>arr[st.peek()]) nge_arr[st.pop()]=arr[curr];
            st.push(curr++);
        }
        while(st.isEmpty()==false) nge_arr[st.pop()]=-1;
        return nge_arr;
    }
}