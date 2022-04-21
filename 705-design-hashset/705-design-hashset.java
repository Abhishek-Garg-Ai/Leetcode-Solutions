class MyHashSet {
    ArrayList<Integer>[] arr;
    int size=100;
    public MyHashSet() {
        arr=new ArrayList[size+1];
        // System.out.println(arr.length);
        for(int i=0;i<arr.length;i++) arr[i]=new ArrayList<>();
    }
    
    public void add(int key) {
        if(arr[key%size].contains(key)==false) arr[key%size].add(key);
    }
    
    public void remove(int key) {
        // System.out.println(arr[key%size].contains(key));
        if(arr[key%size].contains(key)) arr[key%size].remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        return arr[key%size].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */