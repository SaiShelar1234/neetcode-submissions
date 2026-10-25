class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        int i=0;
        int j=nums.size()-1;

        while(i<=j)
        {
            int sum=nums[i]+nums[j];
            if(target==sum)
            {
                return {i+1,j+1};
            }
            else if(target>sum)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return {0,0};
    }
};
