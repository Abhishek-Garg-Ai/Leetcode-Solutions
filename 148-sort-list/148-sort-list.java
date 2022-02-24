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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=getMid(head);
        ListNode temp1=sortList(head);
        ListNode temp2=sortList(mid);
        return merge(temp1,temp2);
    }
    
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(h1!=null && h2!=null){
            ListNode nxt;
            if(h1.val<=h2.val){
                nxt=h1;
                h1=h1.next;
            }else{
                nxt=h2;
                h2=h2.next;
            }
            nxt.next=null;
            temp.next=nxt;
            temp=temp.next;
        }
        if(h1!=null) temp.next=h1;
        if(h2!=null) temp.next=h2;
        return dummy.next;
    }
    
    public ListNode getMid(ListNode head){
        ListNode fast_p=head,slow_p=head;
        ListNode prev=null;
        while(fast_p!=null && fast_p.next!=null){
            fast_p=fast_p.next.next;
            prev=slow_p;
            slow_p=slow_p.next;
        }
        prev.next=null;
        return slow_p;
    }
}