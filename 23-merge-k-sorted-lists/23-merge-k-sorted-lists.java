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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pq.add(lists[i]);  
            } 
        }
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(pq.size()>0){
            ListNode curr=pq.poll();
            temp.next=curr;
            temp=curr;
            if(curr.next!=null) pq.add(curr.next);
        }
        return dummy.next;
    }
}