/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
         int cnt=0;
       Node temp=head;
       while(temp!=null){
           cnt++;
           temp=temp.next;
       }
        int count=0;
        int des=cnt-k+1;
        Node temp1=head;
       while(temp1!=null){
           count++;
           if(count==des){
               return temp1.data;
              
           }
           temp1=temp1.next;
       }
       return -1;
    }
}