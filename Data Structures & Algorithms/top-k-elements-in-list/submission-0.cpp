class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        
        unordered_map<int,int>mp;

        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
        }

        vector<vector<int>>bucket(nums.size()+1);

        for(auto it:mp)
        {
            bucket[it.second].push_back(it.first);
        }

        vector<int>ans;

        for(int it=bucket.size()-1;it>=1;it--)
        {
            for(auto i:bucket[it])
            {
                ans.push_back(i);

                if(ans.size()==k)
                {
                    return ans;
                }
            }
        }

        return ans;
    }
};
