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
    
    void findOrder(TreeNode root, List<Integer> l,int level)
    {
        if(root==null)
        {
            return;
        }
        
        if(level==l.size())
        {
            l.add(root.val);
        }
        findOrder(root.right,l,level+1);
        findOrder(root.left,l,level+1);
        
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans=new ArrayList<>();
        findOrder(root,ans,0);
        return ans;
        
    }
}