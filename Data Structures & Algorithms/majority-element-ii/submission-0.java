class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int cnt1 = 0;
        int cnt2 = 0;

        int ele1 = 0;
        int ele2 = 0;

        int i = 0;

        // First pass: Find potential candidates
        while (i < nums.length) {

            if (cnt1 == 0 && ele2 != nums[i]) {
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if (cnt2 == 0 && ele1 != nums[i]) {
                ele2 = nums[i];
                cnt2 = 1;
            }
            else if (ele1 == nums[i]) {
                cnt1++;
            }
            else if (ele2 == nums[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }

            i++;
        }

        // Second pass: Verify candidates
        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == ele1) {
                cnt1++;
            }
            else if (num == ele2) {
                cnt2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (cnt1 > nums.length / 3) {
            ans.add(ele1);
        }

        if (cnt2 > nums.length / 3) {
            ans.add(ele2);
        }

        return ans;
    }
}