
class Solution {
public:

    bool ispossible(int mid, const vector<int>& nums, int h) {
        long long sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += (nums[i] + mid - 1) / mid;
        }

        return sum <= h;
    }

    int minEatingSpeed(vector<int>& nums, int h) {

        int i = 1;
        int j = *max_element(nums.begin(), nums.end());
        int ans = j;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (ispossible(mid, nums, h)) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return ans;
    }
};
