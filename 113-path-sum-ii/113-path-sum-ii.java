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
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result=new ArrayList<>();
        Deque<Integer> lt=new ArrayDeque<>();
        helper(root,targetSum,lt);
        return result;
    }
    public void helper(TreeNode root,int sum,Deque<Integer> lt){
        if(root==null) return;
        if(root.left==null && root.right==null && sum==root.val){
            lt.addLast(root.val);
            result.add(new ArrayList<>(lt));
            lt.removeLast();
        }lt.addLast(root.val);
        sum-=root.val;
        helper(root.left,sum,lt);
        helper(root.right,sum,lt);
        lt.removeLast();
    }
}