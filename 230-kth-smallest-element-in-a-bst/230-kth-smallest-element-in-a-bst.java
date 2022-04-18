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
    int curr=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        curr=k;
        inorder(root);
        return ans;
    }
    
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        // System.out.println(root.val+" "+curr);
        if(curr==1) ans=root.val;
        curr-=1;
        inorder(root.right);
    }
}