
class Solution {

    int cnt = 0;
    int ans = -1;

    private void findKSmallest(TreeNode root, int k) {

        if (root == null) {
            return;
        }

        findKSmallest(root.left, k);

        cnt++;

        if (cnt == k) {
            ans = root.val;
            return;
        }

        findKSmallest(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {

        findKSmallest(root, k);

        return ans;
    }
}
