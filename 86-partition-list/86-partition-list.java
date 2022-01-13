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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=new ListNode();
        ListNode head2=new ListNode();
        ListNode curr=head;
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=null;
            if(curr.val<x){
                temp1.next=curr;
                temp1=curr;
            }else{
                temp2.next=curr;
                temp2=curr;
            }
            curr=nxt;
        }
        temp1.next=head2.next;
        return head1.next;
    }
}