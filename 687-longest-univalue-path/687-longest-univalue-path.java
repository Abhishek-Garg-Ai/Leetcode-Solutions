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
    int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        int l=helper(root,root.left);
        int r=helper(root,root.right);
        ans=Math.max(ans,l+r+1);
        return ans-1;
    }
    
    public int helper(TreeNode parent, TreeNode node){
        if(node==null) return 0;
        int l=helper(node,node.left);
        int r=helper(node,node.right);
        ans=Math.max(ans,l+r+1);
        if(parent.val!=node.val) return 0;
        return Math.max(l,r)+1;
    }
}