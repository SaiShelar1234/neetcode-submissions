/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int findMax(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        return Math.max(findMax(root.left),findMax(root.right))+1;
    }
    public int maxDepth(TreeNode root) {

        int max=findMax(root);

        return max;
        
    }
}
