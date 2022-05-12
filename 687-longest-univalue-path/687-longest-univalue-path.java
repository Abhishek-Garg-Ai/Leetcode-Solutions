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
        ans = Math.max(l+r+1, ans);
        return ans-1;
    }
    
    public int helper(TreeNode parent,TreeNode curr){
        if(curr==null) return 0;
        int l=helper(curr,curr.left);
        int r=helper(curr,curr.right);
        ans=Math.max(l+r+1,ans);
        if(curr.val != parent.val)
            return 0;
        return Math.max(l, r) + 1;
    }
}