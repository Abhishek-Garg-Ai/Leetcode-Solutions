class MyStack {
    Queue<Integer> q1;
    int last_insert=0;
    public MyStack() {
        q1=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int s=q1.size();
        while(s>1){
            q1.add(q1.remove());
            s-=1;
        } 
        return q1.remove();
    }
    
    public int top() {
        int ans=this.pop();
        q1.add(ans);
        return ans;    
    }
    
    public boolean empty() {
        return q1.size()==0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */