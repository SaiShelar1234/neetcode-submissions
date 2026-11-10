class Bucket {

    private LinkedList<Integer> container;

    public Bucket() {
        container = new LinkedList<>();
    }

    // Insert value if it does not already exist
    public void insert(Integer val) {

        if (!container.contains(val)) {
            container.addFirst(val);
        }
    }

    // Remove the value if it exists
    public void remove(Integer val) {
        container.remove(val);
    }

    // Check whether value exists
    public boolean contains(Integer val) {
        return container.contains(val);
    }
}

class MyHashSet {

    private static final int numBuckets = 769;

    private Bucket[] buckets;

    public MyHashSet() {

        buckets = new Bucket[numBuckets];

        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new Bucket();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % numBuckets;
    }

    public void add(int key) {

        int index = hash(key);

        buckets[index].insert(key);
    }

    public void remove(int key) {

        int index = hash(key);

        buckets[index].remove(key);
    }

    public boolean contains(int key) {

        int index = hash(key);

        return buckets[index].contains(key);
    }
}
