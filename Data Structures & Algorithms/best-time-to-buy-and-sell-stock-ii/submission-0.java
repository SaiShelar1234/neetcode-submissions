class Solution {
    public int maxProfit(int[] nums) {
        int i=1;
        int mini=nums[0];
        int sum=0;

        while(i<nums.length)
        {
            if(nums[i]>mini)
            {
                sum+=nums[i]-mini;
                mini=nums[i];
            }
            else
            {
                mini=nums[i];
            }
            i++;
        }

        return sum;
    }
}