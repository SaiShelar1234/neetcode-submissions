class Solution {
public:
    void combinationSum(vector<int>& nums, int target,
                        vector<vector<int>>& ans,
                        vector<int>& temp, int i, int sum) {

        if(sum == target) {
            ans.push_back(temp);
            return;
        }

        if(i == nums.size() || sum > target) {
            return;
        }

        // Include current element
        temp.push_back(nums[i]);

        combinationSum(nums, target, ans, temp,
                        i + 1, sum + nums[i]);

        // Backtrack
        temp.pop_back();

        // Exclude current element
        int j = i + 1;

        // Skip all duplicates of the current element
        while(j < nums.size() && nums[j] == nums[i]) {
            j++;
        }

        combinationSum(nums, target, ans, temp, j, sum);
    }

    vector<vector<int>> combinationSum2(vector<int>& nums,
                                          int target) {

        vector<vector<int>> ans;
        vector<int> temp;

        sort(nums.begin(), nums.end());

        combinationSum(nums, target, ans, temp, 0, 0);

        return ans;
    }
};