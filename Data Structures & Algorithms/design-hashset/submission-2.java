class MyHashSet {
    
    private LinkedList<Integer> bucket[];
    private int capacity=1000;

    public MyHashSet() {
        
        bucket = new LinkedList[capacity];

        for(int i=0;i<capacity;i++)
        {
            bucket[i]=new LinkedList<>();
        }
    }
    
    int hash(int key)
    {
        return key%capacity;
    }

    public void add(int key) {
        
        int index=hash(key);
        if(!bucket[index].contains(key))
        {
            bucket[index].add(key);
        }
    }
    
    public void remove(int key) {

        int index = hash(key);

        bucket[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        
        int index=hash(key);
        return bucket[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */