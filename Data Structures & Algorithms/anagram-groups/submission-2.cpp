// Prefer unordered_map when discussing performance, and understand why custom hashing is necessary. Also remember that hash collisions are handled using key equality, so different frequency vectors will not incorrectly become the same group.

class Solution {
public:

    struct VectorHash {
        size_t operator()(const vector<int>& v) const {
            size_t seed = 0;

            for(int x : v) {
                seed ^= hash<int>{}(x) + 0x9e3779b9
                        + (seed << 6) + (seed >> 2);
            }

            return seed;
        }
    };

    vector<vector<string>> groupAnagrams(vector<string>& strs) {

        unordered_map<vector<int>, vector<string>, VectorHash> mp;

        for(int i = 0; i < strs.size(); i++)
        {
            vector<int> vec(26, 0);

            for(int j = 0; j < strs[i].size(); j++)
            {
                vec[strs[i][j] - 'a']++;
            }

            mp[vec].push_back(strs[i]);
        }

        vector<vector<string>> ans;

        for(auto it : mp)
        {
            ans.push_back(it.second);
        }

        return ans;
    }
};
