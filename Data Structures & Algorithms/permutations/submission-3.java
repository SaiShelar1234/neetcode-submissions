
class Solution {

    public void backtrack(int[] nums, ArrayList<Integer> temp,
                          List<List<Integer>> result) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int number : nums) {

            if (temp.contains(number)) {
                continue;
            }

            temp.add(number);

            backtrack(nums, temp, result);

            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result);

        return result;
    }
}