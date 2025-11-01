/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
          Node temp=head;
      Node p=new Node(x);
      head=p;
      head.next=temp;
      return head;
    }
}