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
    
    void findInorder(TreeNode root, List<Integer> l)
    {
         if(root==null)
        {
            return;
        }
        findInorder(root.left,l);
        l.add(root.val);
        findInorder(root.right,l);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>  ans=new ArrayList<>();
        
        findInorder(root,ans);
        return ans;
    }
}