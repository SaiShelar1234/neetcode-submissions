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
    int diameter=0;

    private int diameter(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
 


        int l=diameter(root.left);
        int r=diameter(root.right);
                int val=l+r;
        diameter=Math.max(val,diameter);

        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        int ans=diameter(root);
        return diameter;
    }
}
