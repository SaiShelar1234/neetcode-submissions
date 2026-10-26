class Solution {
public:
    int maxProfit(vector<int>& nums) {
        

        int maxi=0;

        int min=nums[0];
        
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            maxi=max(maxi,nums[i]-min);
        }

        return maxi;
    }
};
