class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        
        int size=nums.size();
        for(int i=0;i<size;i)
        {
            if(nums[i]==val)
            {
                int j=i+1;
                while(j<size)
                {
                    nums[j-1]=nums[j];
                    j++;
                }
                size--;
            }
            else
            {
                i++;
            }
        }

        return size;
    }
};