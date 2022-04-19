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
    TreeNode prev_max=new TreeNode(Integer.MIN_VALUE);
    TreeNode next_min;
    public void recoverTree(TreeNode root) {
        inorder(root);
        // System.out.println(prev_max.val+" "+next_min.val);
        int temp=prev_max.val;
        prev_max.val=next_min.val;
        next_min.val=temp;
    }
    
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(next_min!=null && root.val<next_min.val) next_min=root;
        if(root.val<prev_max.val){
            next_min=root;
        }
        else if(next_min==null && root.val>prev_max.val) prev_max=root;
        inorder(root.right);
    }
    
    
    
}