class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=-1,ele2=-1;
        int cnt1=0;
        int cnt2=0;

        
        for(int num: nums)
        {
             if(cnt1==0&& num != ele2)
             {
                cnt1=1;
                ele1=num;
             }
             else if(cnt2==0&& num != ele1)
             {
                cnt2=1;
                ele2=num;
             }
             else if(num == ele1)
             {
                cnt1++;
             }
             else if(num ==ele2)
             {
                cnt2++;
             }
             else
             {
                cnt1--;
                cnt2--;
             }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (cnt1 > nums.length / 3) ans.add(ele1);
        if (cnt2 > nums.length / 3) ans.add(ele2);

        return ans;
    }

        
    
}