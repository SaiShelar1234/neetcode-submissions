class Solution {
public:

    void findPermute(vector<vector<int>>& ans,
                     vector<int>& temp,
                     vector<int>& nums,
                     unordered_map<int,bool>& mp)
    {
        // Base case
        if(temp.size() == nums.size())
        {
            ans.push_back(temp);
            return;
        }

        for(int i = 0; i < nums.size(); i++)
        {
            // Already used
            if(mp[nums[i]] == true)
                continue;

            // Choose
            temp.push_back(nums[i]);
            mp[nums[i]] = true;

            // Explore
            findPermute(ans, temp, nums, mp);

            // Undo
            temp.pop_back();
            mp[nums[i]] = false;
        }
    }

    vector<vector<int>> permute(vector<int>& nums) {

        vector<vector<int>> ans;
        vector<int> temp;

        unordered_map<int,bool> mp;

        findPermute(ans, temp, nums, mp);

        return ans;
    }
};