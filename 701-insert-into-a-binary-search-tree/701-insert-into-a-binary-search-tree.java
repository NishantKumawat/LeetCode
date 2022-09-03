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
    
    TreeNode insertNode(TreeNode root, int val, TreeNode ans)
    {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        
        if(val>root.val)
        {
            if(root.right==null)
            {
                root.right=new TreeNode(val,null,null);
            }
            else
            {
                return insertNode(root.right,val,ans);
            }
        }
        if(val<root.val)
        {
            if(root.left==null)
            {
                root.left=new TreeNode(val,null,null);
            }
            else
            {
                return insertNode(root.left,val,ans);
            }
        }
        return ans;
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        return insertNode(root,val,root);
        
    }
}