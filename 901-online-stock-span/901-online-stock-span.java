class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> lt;
    int index;

    public StockSpanner() {
        st=new Stack<>();
        lt=new ArrayList<>();
    }
    
    public int next(int price) {
        lt.add(price);
        int index=lt.size()-1;//3
        while(st.isEmpty()==false && lt.get(st.peek())<=price) st.pop();
        
        int result=index+1;
        if(!st.isEmpty()) result=index-st.peek();
        st.push(index);
        return result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */