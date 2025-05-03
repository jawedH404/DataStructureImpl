public class StackLinkedList {

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;  // head or top
    private int size;

    // push
    public void push(int value){
        Node node = new Node(value);
        node.next = head;           // it checks for empty stack ; head is null if empty
        head = node;
        size++;
    }

    // pop 
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int popped = head.value;
        head = head.next;
        size--;
        return popped;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.value;
    }

    public boolean isEmpty(){
        return head == null;
    }

    // get size
    public int size(){
        return size;
    }

    // Traversing
    public void display(){
        Node tempNode = head;
        System.out.println("Stack top to bottom : ");
        while(tempNode != null){
            System.out.print(tempNode.value+ " ");
            tempNode = tempNode.next;
        }
        System.out.println();

    }


}
