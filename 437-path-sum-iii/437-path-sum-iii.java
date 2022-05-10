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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        return helper(root,map,0,targetSum);
    }
    
    public int helper(TreeNode root, HashMap<Integer,Integer> map,int sum,int target){
        if(root==null) return 0;
        sum+=root.val;
        int ans=map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        ans+=helper(root.left,map,sum,target);
        ans+=helper(root.right,map,sum,target);
        if(map.get(sum)==1) map.remove(sum);
        else map.put(sum,map.get(sum)-1);
        return ans;
    }
}