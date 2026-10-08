class MyHashSet {
public:
    static const int BUCKETS=1009;
    vector<int>buckets[BUCKETS];
    MyHashSet() {
        
    }

    void add(int key) {
        int index=key%BUCKETS;
        if(!contains(key))
        {
           buckets[index].push_back(key);
        }
    }
    
    void remove(int key) {
        int index=key%BUCKETS;
        
        for(auto     it=buckets[index].begin();it!=buckets[index].end();it++)
        {
            if(*it==key)
            {
                buckets[index].erase(it);
                return;
            }
        }
    }
    
    bool contains(int key) {
                int index=key%BUCKETS;

        for(int val:buckets[index])
        {
            if(val==key)
            {
                return true;
            }
        }

        return false;
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */