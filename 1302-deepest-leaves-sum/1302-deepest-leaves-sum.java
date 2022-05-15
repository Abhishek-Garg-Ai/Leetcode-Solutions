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
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            int l=q.size();
            ans=0;
            while(l>0){
                TreeNode curr=q.poll();
                ans+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                l-=1;
            }
        }
        return ans;
    }
}