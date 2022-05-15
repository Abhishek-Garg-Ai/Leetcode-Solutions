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
    
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        // System.out.println(h);
        return helper(root,h);
    }
    
    public int helper(TreeNode root, int level){
        if(root==null) return 0;
        if(level==1) return root.val;
        return helper(root.left,level-1)+helper(root.right,level-1);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}