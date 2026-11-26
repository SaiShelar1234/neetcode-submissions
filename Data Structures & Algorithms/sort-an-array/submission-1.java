class Solution {
    public int[] sortArray(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int ind=-1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<temp)
                {
                    temp=nums[j];
                    ind=j;
                }
            }
            if(ind!=-1)
            {
                int curr=nums[i];
                nums[i]=temp;
                nums[ind]=curr;   
            }
        }

        return nums;
    }
}