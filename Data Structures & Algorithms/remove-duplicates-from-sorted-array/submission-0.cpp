class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int i=0;

        int j=0;

        while(i<nums.size())
        {
            if(i!=0&&nums[i-1]!=nums[i])
            {
                j++;
                nums[j]=nums[i];
            }
            i++;
        }

        return j+1;
    }
};