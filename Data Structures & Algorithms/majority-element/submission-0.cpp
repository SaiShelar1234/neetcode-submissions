class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        int cnt=1;
        int maxi=nums[0];
        for(int i=1;i<nums.size();i++)
        {
             if(cnt==0)
             {
                cnt=1;
                maxi=nums[i];
             }
             else if(nums[i]==maxi)
             {
                cnt++;
             }
             else
             {
                cnt--;
             }
        }

        return maxi;
    }
};