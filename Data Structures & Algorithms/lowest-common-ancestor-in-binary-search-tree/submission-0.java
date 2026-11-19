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
    private TreeNode findLowest(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root==null)
        {
            return null;
        }

        if(root==p||root==q)
        {
            return root;
        }

        TreeNode l=findLowest(root.left,p,q);
        TreeNode r=findLowest(root.right,p,q);

        if(l!=null&&r!=null)
        {
            return root;
        }

        if(l==null)
        {
            return r;
        }

        if(r==null)
        {
            return l;
        }

        return null;



    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode ans=findLowest(root,p,q);

        return ans;
    }
}
