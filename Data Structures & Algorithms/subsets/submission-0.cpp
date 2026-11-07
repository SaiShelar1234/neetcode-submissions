class Solution {
public:
    void subset(vector<int>&nums,vector<vector<int>>&ans,int    i,vector<int>temp)
    {
        if(i==nums.size())
        {
            ans.push_back(temp);
            return ;
        }

        temp.push_back(nums[i]);
        subset(nums,ans,i+1,temp);
        temp.pop_back();
        subset(nums,ans,i+1,temp);


    }
    vector<vector<int>> subsets(vector<int>& nums) {
        
        vector<vector<int>>ans;
        vector<int>temp;

        subset(nums,ans,0,temp);

        return ans;
    }
};
