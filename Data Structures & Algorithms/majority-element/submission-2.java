class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int val=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(cnt==0)
            {
               val=nums[i];
               cnt=1;
            }
            else if(val == nums[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }

        return val;
    }
}