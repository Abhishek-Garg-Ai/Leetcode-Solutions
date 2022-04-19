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
    TreeNode node1,node2;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
    }
    
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev.val>root.val){
            if(node2!=null) node2=root; 
            else{
                node1=prev;
                node2=root;
            }
            prev=root;
        }
        prev=root;
        inorder(root.right);
    }
}