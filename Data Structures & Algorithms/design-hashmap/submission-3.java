

class MyHashMap {

    class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] bucket;
    private int capacity = 10000;

    public MyHashMap() {
        bucket = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    int hash(int key) {
        return key % capacity;
    }

    public void put(int key, int value) {

        int index = hash(key);

        for (Node node : bucket[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        bucket[index].add(new Node(key, value));
    }

    public int get(int key) {

        int index = hash(key);

        for (Node node : bucket[index]) {
            if (node.key == key) {
                return node.value;
            }
        }

        return -1;
    }

    public void remove(int key) {

        int index = hash(key);

        bucket[index].removeIf(node -> node.key == key);
    }
}
