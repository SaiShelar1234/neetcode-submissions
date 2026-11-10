class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // 3. Place elements into buckets based on frequency
        for (int num : map.keySet()) {
            int freq = map.get(num);
            bucket[freq].add(num);
        }

        // 4. Collect top K frequent elements
        int[] ans = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {

            for (int num : bucket[i]) {
                ans[index++] = num;

                if (index == k) {
                    return ans;
                }
            }
        }

        return ans;
    }
}