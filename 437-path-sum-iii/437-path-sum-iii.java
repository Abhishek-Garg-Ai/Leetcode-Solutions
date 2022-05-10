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
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        helper(root,map,0,targetSum);
        // System.out.println(map);
        return ans;
    }
    
    public void helper(TreeNode root, HashMap<Integer,Integer> map,int sum,int target){
        if(root==null) return;
        sum+=root.val;
        ans+=map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        helper(root.left,map,sum,target);
        helper(root.right,map,sum,target);
        if(map.get(sum)==1) map.remove(sum);
        else map.put(sum,map.get(sum)-1);
    }
}