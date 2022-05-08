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
    String ans="";
    public String smallestFromLeaf(TreeNode root) {
        StringBuffer sb=new StringBuffer();
        helper(root,sb);
        return ans;
    }
    
    public void helper(TreeNode root,StringBuffer sb){
        if(root==null) return;
        if(root.left==null && root.right==null){
            sb.append((char)(root.val+'a'));
            sb.reverse();
            if(ans.equals("") || ans.compareTo(sb.toString())>0)
                ans=sb.toString();
            sb.reverse();
            sb.deleteCharAt(sb.length()-1);
            return;
        }
        sb.append((char)(root.val+'a'));
        helper(root.left,sb);
        helper(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
        
    }
}