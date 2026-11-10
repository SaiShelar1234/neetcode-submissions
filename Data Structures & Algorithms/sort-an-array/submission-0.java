class Solution {
    public int[] sortArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int ind = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    ind = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[ind];
            nums[ind] = temp;
        }

        return nums;
    }
}