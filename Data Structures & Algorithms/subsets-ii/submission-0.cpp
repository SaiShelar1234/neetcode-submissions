class Solution {
public:

    void findSubset(vector<int>& nums, int i,
                    vector<int> temp,
                    vector<vector<int>>& ans)
    {
        if(i == nums.size())
        {
            ans.push_back(temp);
            return;
        }

        // PICK
        temp.push_back(nums[i]);

        findSubset(nums, i + 1, temp, ans);

        // Backtrack
        temp.pop_back();

        // Skip duplicates
        while(i + 1 < nums.size() && nums[i] == nums[i + 1])
        {
            i++;
        }

        // NOT PICK
        findSubset(nums, i + 1, temp, ans);
    }

    vector<vector<int>> subsetsWithDup(vector<int>& nums) {

        sort(nums.begin(), nums.end());

        vector<int> temp;
        vector<vector<int>> ans;

        findSubset(nums, 0, temp, ans);

        return ans;
    }
};