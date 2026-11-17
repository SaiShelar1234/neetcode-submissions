/**
You can use any traversal technique. The key is to swap the left and right children of every node exactly once.


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
    public TreeNode invert(TreeNode curr)
    {
        if(curr==null)
        {
            return null;
        }

        TreeNode temp=curr.left;
        curr.left=curr.right;
        curr.right=temp;

        invert(curr.left);
        invert(curr.right);

        return curr;
    }

    public TreeNode invertTree(TreeNode root) {
        

        TreeNode curr=invert(root);

        return root;
    }
}
