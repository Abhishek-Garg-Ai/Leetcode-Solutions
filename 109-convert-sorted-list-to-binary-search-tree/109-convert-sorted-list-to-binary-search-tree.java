/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head);
    }
    
    
    public TreeNode helper(ListNode head){
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode mid=getMiddle(head);
        TreeNode root=new TreeNode(mid.val);
        root.left=helper(head);
        if(mid.next!=null) root.right=helper(mid.next);
        
        return root;
    
    }
    
    public ListNode getMiddle(ListNode head){
        if(head==null) return head;
        ListNode fast_p=head;
        ListNode slow_p=head;
        ListNode prev=null;
        while(fast_p!=null && fast_p.next!=null){
            fast_p=fast_p.next.next;
            prev=slow_p;
            slow_p=slow_p.next;
        }
        if(prev!=null)prev.next=null;
        return slow_p;
    }
}