/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr=head;
        while(curr!=null){
            Node temp=new Node(curr.val);
            temp.next=curr.next;
            curr.next=temp;
            curr=curr.next.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null) curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        curr=head;
        Node newHead=new Node(0);
        Node nxt=null;
        Node temp=newHead;
        while(curr!=null){
            nxt=curr.next;
            curr.next=nxt.next;
            temp.next=nxt;
            temp=temp.next;
            curr=curr.next;
        }
        
        return newHead.next;
    }
}