class Solution {

    int cnt = 0;

    private void findGoodCount(TreeNode root, int val) {

        if (root == null) {
            return;
        }

        if (root.val >= val) {
            cnt++;
            val = root.val;
        }

        findGoodCount(root.left, val);
        findGoodCount(root.right, val);
    }

    public int goodNodes(TreeNode root) {

        cnt = 0;

        findGoodCount(root, Integer.MIN_VALUE);

        return cnt;
    }
}