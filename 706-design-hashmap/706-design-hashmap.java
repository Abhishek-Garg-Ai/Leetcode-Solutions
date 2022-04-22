
class MyHashMap {
    int size=100;
    Node[] arr;
    public MyHashMap() {
        arr=new Node[size];
        for(int i=0;i<arr.length;i++) arr[i]=null;
    }
    
    public void put(int key, int value) {
        Node temp=arr[key%size];
        if(temp==null){
            arr[key%size]=new Node(key,value);
            return;
        } 
        Node prev=null;
        while(temp!=null){
            if(temp.key==key){
                temp.val=value;
                return;
            }
            prev=temp;
            temp=temp.next;
        }
        prev.next=new Node(key,value);
        
    }
    
    public int get(int key) {
        Node temp=arr[key%size];
        while(temp!=null){
            if(temp.key==key) return temp.val;
            temp=temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node temp=arr[key%size];
        if(temp==null) return;
        if(temp.key==key){
            arr[key%size]=temp.next;
            return;
        }
        Node prev=temp;
        temp=temp.next;
        while(temp!=null){
            if(temp.key==key){
                prev.next=temp.next;
                return;
            }
            prev=temp;
            temp=temp.next;
        }
    }

    class Node{
        int val;
        int key;
        Node next;

        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */