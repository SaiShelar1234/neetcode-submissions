class Solution {
    int maxi = Integer.MIN_VALUE;

    private int maxFind(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int l = maxFind(root.left);
        int r = maxFind(root.right);

        maxi = Math.max(maxi,
                root.val + Math.max(0, l) + Math.max(0, r));

        return root.val + Math.max(0, Math.max(l, r));
    }

    public int maxPathSum(TreeNode root) {
        maxFind(root);
        return maxi;
    }
}