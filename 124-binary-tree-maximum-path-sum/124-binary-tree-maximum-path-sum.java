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
    int ans=-1001;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        ans=Math.max(left+right+root.val,ans);
        int res=Math.max(Math.max(root.val,0), Math.max(left,right)+root.val);
        return res;
    }
}