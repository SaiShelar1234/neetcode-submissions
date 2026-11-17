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
    public void Traversal(List<Integer>ans,TreeNode root)
    {
        Stack<TreeNode>st=new Stack<>();

        TreeNode curr=root;
        
        if(curr!=null)
        {
          st.push(curr);
        }
        

        while(!st.isEmpty())
        {
        
           curr=st.peek();
           int val=curr.val;

           ans.add(val);

           st.pop();

           if(curr.right!=null)
           {
            st.push(curr.right);
           }

           if(curr.left!=null)
           {
            st.push(curr.left);
           }
        }

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();

        Traversal(ans,root);

        return ans;
    }
}