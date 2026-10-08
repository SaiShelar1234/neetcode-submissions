class MyHashMap {
public:
    static const int BUCKETS = 1009;
    vector<pair<int, int>> buckets[BUCKETS];

    MyHashMap() {
    }
    
    void put(int key, int value) {
        int index = key % BUCKETS;

        for(auto &it : buckets[index]) {
            if(it.first == key) {
                it.second = value;
                return;
            }
        }

        buckets[index].push_back({key, value});
    }
    
    int get(int key) {
        int index = key % BUCKETS;

        for(auto &it : buckets[index]) {
            if(it.first == key) {
                return it.second;
            }
        }

        return -1;
    }
    
    void remove(int key) {
        int index = key % BUCKETS;

        for(auto it = buckets[index].begin();
            it != buckets[index].end();
            ++it) {

            if(it->first == key) {
                buckets[index].erase(it);
                return;
            }
        }
    }
};