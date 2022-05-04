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
    List<Integer> lt;
    int maxLevel=-1;
    public List<Integer> rightSideView(TreeNode root) {
        lt=new ArrayList<>();
        helper(root,0);
        return lt;
    }
    
    public void helper(TreeNode root,int level){
        if(root==null) return;
        if(level>maxLevel){
            lt.add(root.val);
            maxLevel=level;
        }
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
}