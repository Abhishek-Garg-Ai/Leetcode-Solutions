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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode newHead=head.next;
        ListNode prev=new ListNode();
        while(curr!=null && curr.next!=null){
            ListNode nxt=curr.next;
            curr.next=curr.next.next;
            nxt.next=curr;
            prev.next=nxt;
            prev=curr;
            curr=curr.next;
        }
        return newHead;
    }
}