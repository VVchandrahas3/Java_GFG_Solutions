// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
     Node top;
     int size;
     int N;
    public myStack() {
         top=null;
         size=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return size==0;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size=size+1;
        
    }

    public void pop() {
        // Removes the front element of the stack.
        if(size!=0){
        top=top.next;
        size--;
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(size==0) return -1;
        return top.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
