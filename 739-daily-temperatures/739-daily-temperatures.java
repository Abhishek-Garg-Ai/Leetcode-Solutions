class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] result=new int[temps.length];    
        Stack<Integer> st=new Stack<>();
        int curr=0;
        while(curr<temps.length){
            while(st.isEmpty()==false && temps[curr]>temps[st.peek()]) result[st.peek()]=curr-st.pop();
            st.push(curr++);
        }
        return result;
    }
}