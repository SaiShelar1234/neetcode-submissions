class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Step 1: Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Step 2: Find the starting element of each sequence
        for (int num : set) {

            // Start counting only if previous element doesn't exist
            if (!set.contains(num - 1)) {

                int cnt = 1;
                int ele = num;

                // Step 3: Find consecutive elements
                while (set.contains(ele + 1)) {
                    ele++;
                    cnt++;
                }

                maxLen = Math.max(maxLen, cnt);
            }
        }

        return maxLen;
    }
}