class LRUCache {
    int capacity;
    HashMap<Integer,Node> map = new HashMap<>();
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    int size=0;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            remove(map.get(key));
            insert(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node=new Node(key,value);
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        else{
            if(size==capacity){
                int removedKey=remove(tail.prev);
                map.remove(removedKey);
            }
            else size++;
        }
        map.put(key,node);
        insert(node);
    }
    
    private void insert(Node node){
        Node headNext=head.next;
        head.next=node;
        node.next=headNext;
        node.prev=head;
        headNext.prev=node;
    }
    
    public int remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        return node.key;
    }
    
    class Node{
        Node prev;
        Node next;
        int key;
        int value;
        public Node(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */