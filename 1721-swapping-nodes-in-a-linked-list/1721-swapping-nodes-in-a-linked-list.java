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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1=null;
        ListNode p2=head;
        ListNode p3=head;
        int c=0;
        while(c<k){
            p1=p3;
            p3=p3.next;
            c+=1;
        }
        while(p3!=null){
            p3=p3.next;
            p2=p2.next;
        }
        int temp=p1.val;
        p1.val=p2.val;
        p2.val=temp;
        return head;
    }
    
    
}