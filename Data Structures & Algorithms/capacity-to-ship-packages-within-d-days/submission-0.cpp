//ispossibel logic is really important here
class Solution {
public:

    bool ispossible(int mid, vector<int>& nums, int days) {
        int sum = 0;
        int count = 1;

        for (int i = 0; i < nums.size(); i++) {

            if (sum + nums[i] > mid) {
                count++;
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
        }

        return count <= days;
    }

    int shipWithinDays(vector<int>& nums, int days) {

        int i = *max_element(nums.begin(), nums.end());
        int j = accumulate(nums.begin(), nums.end(), 0);

        int ans = j;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (ispossible(mid, nums, days)) {
                ans = mid;
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        return ans;
    }
};
