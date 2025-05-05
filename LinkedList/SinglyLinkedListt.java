package LinkedList;

public class SinglyLinkedListt {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedListt(){
        this.size = 0;
    }

     public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        // It checks if tail is null mean 
        //Both head and tail must point to the same single node
        if(tail == null){
            tail = head;
        }
        size++;
     }

     // Insert last 
     public void insertLast(int value){
        Node node = new Node(value);

        // if no element is present then add at first 
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;

        size++;
     }


     // At the given position
     public void insert(int value, int index){

        if(index > size || index < 0){
             System.out.println( "Invalid Index");
             return;
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        
        if(index == size){
            insertLast(value);
            return;
        }

        Node tempNode = head;

        for(int i = 1; i < index; i++){
            tempNode = tempNode.next;
        }

        Node node = new Node(value);

        Node nextNode = tempNode.next;
        tempNode.next = node;
        node.next = nextNode;

        size++;
     }

     // DELETE 

     public void deleteFirst(){
        if(head == null){
            System.out.println("Linked List not Exist");
            return;
        }
        head = head.next;
        size--;

        if(size == 0){
            tail = null;
        }
     }

     public void deleteLast(){
        // CASE 1
        // It checks for the empty also
        if(size <= 1){
            deleteFirst();
            return;
        }

        // CASE 2
       // CASE 2: Move to second last node
        Node tempNode  = head;
        for(int i = 0 ; i < size-2; i++){       // size -2 
            tempNode  = tempNode.next;
        }

        tail = tempNode;
        tail.next = null;
        size--;
     }

     public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        Node tempNode = head;
        for(int i=0; i < index -1; i++){
            tempNode = tempNode.next;
        }
        int value = tempNode.next.value;

        tempNode.next = tempNode.next.next;
        size--;

        return value;
     }

     // Searching from value
     public boolean find(int value){
        Node tempNode = head;
        int i = 0;
        while(tempNode != null){
            if(tempNode.value == value){
                System.out.println("Foud Node at index "+i);
                i++;
                return true;
            }
            
            tempNode = tempNode.next;
            i++;
        }
        System.out.println("Node not found");
        return false;
     }



     // Displaying
     public void display(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.value +" --> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
     }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        // public Node(int value, Node next){
        //     this.value = value;
        //     this.next = next;
        // }
    }

    
}
