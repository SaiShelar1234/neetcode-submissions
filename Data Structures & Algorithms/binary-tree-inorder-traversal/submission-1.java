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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>ans=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();

        TreeNode curr=root;

        while(curr!=null || !st.isEmpty())
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            else
            {
                TreeNode ele=st.peek();
                st.pop();
                ans.add(ele.val);
                curr=ele.right;
            }
        }

        return ans;

        
    }
}