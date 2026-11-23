
class Solution {

    boolean validateBST(TreeNode root, long small, long large) {

        if (root == null) {
            return true;
        }

        if (root.val <= small || root.val >= large) {
            return false;
        }

        boolean l = validateBST(root.left, small, root.val);
        boolean r = validateBST(root.right, root.val, large);

        return l && r;
    }

    public boolean isValidBST(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
