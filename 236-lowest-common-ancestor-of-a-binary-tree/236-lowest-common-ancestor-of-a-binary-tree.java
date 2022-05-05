/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q) return root;
        boolean has_p=helper(root.left,p);
        boolean has_q=helper(root.left,q);
        // System.out.println(root.val+" "+has_p+" "+has_q);
        if(has_p && has_q)
            return lowestCommonAncestor(root.left,p,q);
        if(has_p || has_q)
            return root;
        return lowestCommonAncestor(root.right,p,q);
    }
    
    public boolean helper(TreeNode root, TreeNode p){
        if(root==null) return false;
        if(root==p) return true;
        return helper(root.left,p) || helper(root.right,p);
    }
}