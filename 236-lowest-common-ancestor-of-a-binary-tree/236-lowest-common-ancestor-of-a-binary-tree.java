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
    // HashMap<TreeNode, Boolean> map=new HashMap<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q) return root;
        // if(map.containsKey(root.))
        int has_p=helper(root.left,p.val);
        int has_q=helper(root.left,q.val);
        if(has_p+has_q==2)
            return lowestCommonAncestor(root.left,p,q);
        if(has_p+has_q==1)
            return root;
        return lowestCommonAncestor(root.right,p,q);
    }
    
    public int helper(TreeNode root, int p){
        if(root==null) return 0;
        if(root.val==p) return 1;
        return helper(root.left,p) + helper(root.right,p);
    }
}