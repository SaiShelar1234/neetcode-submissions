class Solution {
public:
    void combinations(vector<int>& nums, int target, int i,
                      vector<vector<int>>& ans, vector<int>& temp) {

        if(target == 0) {
            ans.push_back(temp);
            return;
        }

        if(i == nums.size()) {
            return;
        }

        // Include
        if(nums[i] <= target) {
            temp.push_back(nums[i]);

            combinations(nums, target - nums[i], i, ans, temp);

            temp.pop_back();
        }

        // Exclude
        combinations(nums, target, i + 1, ans, temp);
    }

    vector<vector<int>> combinationSum(vector<int>& nums, int target) {

        vector<vector<int>> ans;
        vector<int> temp;

        sort(nums.begin(), nums.end());

        combinations(nums, target, 0, ans, temp);

        return ans;
    }
};