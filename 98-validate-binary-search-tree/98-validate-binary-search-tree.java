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
    int prev=Integer.MIN_VALUE;
    boolean first=true;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean ans=isValidBST(root.left);
        if(!first && prev>=root.val) return false;
        prev=root.val;
        first=false;
        ans =ans && isValidBST(root.right);
        return ans;
    }
}