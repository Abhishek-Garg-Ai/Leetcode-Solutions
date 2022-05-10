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
    public int pathSum(TreeNode root, int targetSum) {
        path1(root,targetSum);
        return ans;
    }
    
    public void path1(TreeNode root,int targetSum){
        if(root==null) return;
        path1(root.left,targetSum);
        path1(root.right,targetSum);
        path2(root,targetSum);
    }
    
    public void path2(TreeNode root, int targetSum){
        if(root==null) return;
        if(targetSum==root.val) ans+=1;
        path2(root.left,targetSum-root.val);
        path2(root.right,targetSum-root.val);
    }
}