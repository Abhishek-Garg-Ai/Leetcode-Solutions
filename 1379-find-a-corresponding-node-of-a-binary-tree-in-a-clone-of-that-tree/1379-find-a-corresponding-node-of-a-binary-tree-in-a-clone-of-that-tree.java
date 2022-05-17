/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return search(original,cloned,target);
    }
    
    public TreeNode search(TreeNode root1, TreeNode root2, TreeNode target){
        if(root1==target || root1==null) return root2;
        TreeNode ans=search(root1.left,root2.left,target);
        if(ans==null) ans=search(root1.right,root2.right,target);
        return ans;
    }
}