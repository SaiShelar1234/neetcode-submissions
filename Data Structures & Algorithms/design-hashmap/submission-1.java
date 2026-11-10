class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Bucket {

    private LinkedList<Pair> container;

    public Bucket() {
        container = new LinkedList<>();
    }

    // Insert key-value pair
    // If key already exists, update its value
    public void put(int key, int value) {

        for (Pair pair : container) {

            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }

        container.addFirst(new Pair(key, value));
    }

    // Get value associated with key
    public int get(int key) {

        for (Pair pair : container) {

            if (pair.key == key) {
                return pair.value;
            }
        }

        return -1;
    }

    // Remove key-value pair
    public void remove(int key) {

        Iterator<Pair> iterator = container.iterator();

        while (iterator.hasNext()) {

            Pair pair = iterator.next();

            if (pair.key == key) {
                iterator.remove();
                return;
            }
        }
    }
}

class MyHashMap {

    private static final int numBuckets = 769;

    private Bucket[] buckets;

    public MyHashMap() {

        buckets = new Bucket[numBuckets];

        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new Bucket();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % numBuckets;
    }

    // Insert or update key-value pair
    public void put(int key, int value) {

        int index = hash(key);

        buckets[index].put(key, value);
    }

    // Return value associated with key
    public int get(int key) {

        int index = hash(key);

        return buckets[index].get(key);
    }

    // Remove key-value pair
    public void remove(int key) {

        int index = hash(key);

        buckets[index].remove(key);
    }
}