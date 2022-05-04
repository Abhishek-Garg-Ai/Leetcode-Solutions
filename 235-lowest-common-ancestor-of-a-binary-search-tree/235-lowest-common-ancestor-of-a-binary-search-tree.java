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
        if(p.val>q.val){
            TreeNode temp=p;
            p=q;
            q=temp;
        }
        return helper(root,p,q);
    }
    
    public TreeNode helper(TreeNode root,TreeNode p, TreeNode q){
        if(root.val>=p.val && root.val<=q.val) return root;
        if(root.val>q.val) return helper(root.left,p,q);
        return helper(root.right,p,q);
    }
}