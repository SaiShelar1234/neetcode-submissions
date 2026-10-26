class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        
        if(nums.size()==1)
        {
            return false;
        }

        unordered_map<int,int>mp;
        mp[nums[0]]=0;

        for(int i=1;i<nums.size();i++)
        {
            if(mp.find(nums[i])!=mp.end())
            {
                int j=mp[nums[i]];

                if(abs(i-j)<=k)
                {
                    return true;
                }
            }
            mp[nums[i]]=i;
        }

        return false;
    }
};