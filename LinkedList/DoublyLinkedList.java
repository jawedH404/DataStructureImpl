package LinkedList;

public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
    // if an empty LL, then it will not execute
        if(head != null){
            head.prev = node;
        }
        head = node;
    }


    public void insertLast(int value){
        Node newNode = new Node(value);

        if(head == null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
            return;
        }

        Node tempNode = head;
        while(tempNode.next != null ){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.prev = tempNode;
        newNode.next = null;
 
    }

    public void insertAfterValue(int after, int value){

        // Search the value
        Node tempNode = head;
        Node p = null;
        while(tempNode.next != null){
            if(tempNode.value == after){
                p = tempNode;
                break;
            }
            tempNode = tempNode.next;
        }
        if( p == null){
            System.out.println("Node doesnot exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    public void display(){
        Node tempNode = head;

        while(tempNode != null){
            System.out.print(tempNode.value +" -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node tempNode = head;

        int [] arr = new int[10];
        int i = 0;

        while(tempNode != null){
            arr[i++] = tempNode.value;
            tempNode = tempNode.next;
        }

        System.out.println("Reverse order");
        for(int j = i-1; j >= 0; j--){
            System.out.print(arr[j]+" -> ");
        }
        System.out.println("START");
    }
    

    private class Node{
       private int value;
        private Node next; 
        private Node prev; 

        public Node(int value){
            this.value = value;
        }

        // public Node(int value, Node next, Node prev){
        //     this.value = value;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
}
