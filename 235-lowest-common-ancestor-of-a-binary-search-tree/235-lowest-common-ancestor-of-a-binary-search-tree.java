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
        // p contain the min value among p&q
        int min=Math.min(p.val,q.val);
        int max=Math.max(p.val,q.val);
        return helper(root,min,max);
    }
    
    public TreeNode helper(TreeNode root,int p, int q){
        if(root.val>=p && root.val<=q) return root;
        if(root.val>q) return helper(root.left,p,q);
        return helper(root.right,p,q);
    }
}