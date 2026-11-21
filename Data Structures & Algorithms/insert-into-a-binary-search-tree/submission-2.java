class Solution {

    private TreeNode insertNode(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode curr = root;
        TreeNode pre = null;

        while (curr != null) {

            pre = curr;

            if (val < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (val < pre.val) {
            pre.left = new TreeNode(val);
        } else {
            pre.right = new TreeNode(val);
        }

        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        return insertNode(root, val);
    }
}