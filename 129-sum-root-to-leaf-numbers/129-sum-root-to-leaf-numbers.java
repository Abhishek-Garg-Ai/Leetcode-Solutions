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
    public int sumNumbers(TreeNode root) {
        int curr=0;
        helper(root,curr);
        return ans;
    }
    
    public void helper(TreeNode root,int curr){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans+=(curr*10+root.val);
            return;
        }
        curr=curr*10+root.val;
        helper(root.left,curr);
        helper(root.right,curr);
        // curr/=10;
    }
}