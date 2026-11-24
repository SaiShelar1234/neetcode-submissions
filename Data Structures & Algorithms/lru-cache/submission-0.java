
class LRUCache {

    class Node {
        int key, value;
        Node pre, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> mp;
    Node head, tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.pre = head;
    }

    private void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void insert(Node node) {
        Node last = tail.pre;

        last.next = node;
        tail.pre = node;

        node.pre = last;
        node.next = tail;
    }

    public int get(int key) {

        if (!mp.containsKey(key)) {
            return -1;
        }

        Node node = mp.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (mp.containsKey(key)) {

            Node node = mp.get(key);
            node.value = value;

            remove(node);
            insert(node);

        } else {

            Node node = new Node(key, value);
            mp.put(key, node);

            insert(node);

            if (mp.size() > capacity) {

                Node lru = head.next;
                remove(lru);

                mp.remove(lru.key);
            }
        }
    }
}
