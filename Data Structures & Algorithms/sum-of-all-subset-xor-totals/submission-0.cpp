class Solution {
public:
    void subset(vector<int> & nums,int &sum,int i,int temp)
    {
        if(i==nums.size())
        {
            sum+=temp;
            return ;
        }

        subset(nums,sum,i+1,temp^nums[i]);
        subset(nums,sum,i+1,temp);
    }
    int subsetXORSum(vector<int>& nums) {
        
        int sum=0;

        subset(nums,sum,0,0);

        return sum;
    }
};