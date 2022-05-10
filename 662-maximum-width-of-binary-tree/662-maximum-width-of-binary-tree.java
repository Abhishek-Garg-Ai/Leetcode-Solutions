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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        root.val=1;
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            int l=q.size();
            int start=q.peek().val;
            int end=start;
            while(l>0){
                TreeNode curr=q.poll();
                end=curr.val;
                if(curr.left!=null){
                    curr.left.val=curr.val*2-start;
                    q.offer(curr.left);
                }if(curr.right!=null){
                    curr.right.val=curr.val*2+1-start;
                    q.offer(curr.right);
                }
                l-=1;
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
    }
}