public class QueueLinkedList {
    Node head;
    Node tail;    // we use it for easy do insertion operation
    int size;

    public QueueLinkedList(){
        this.size = 0;
        System.out.println("Queue is created ");
    }

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    //Enqueqe . Inserting at end of queue
    public void enQueue(int value){
        Node node  = new Node(value);
        if(isEmpty()){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
        System.out.println("Inserted "+value+" successfully in Queue");
    }


    // deQueue , deleting from first/start
    public int deQueue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            value = head.value;
            head = head.next;
            if(head == null) {
                tail = null;
            }
        }
        size--;
        return value;
    }

    // peek
    public int peek(){
        return isEmpty() ? -1 : head.value;
    }

    // delete
    public void deleteQueue(){
        head = null;
        tail = null;
        System.out.println("Queue is Deleted ");
    }


    // Traversing
    public void display(){
        if(head != null){
            Node tempNode = head;
            System.out.println("Traversing queue");
            while(tempNode != null){
                System.out.print(tempNode.value+" ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
        else {
            System.out.println("Queue is empty");
        }

    }

    // Creation of Node class
    public class Node{
        int value;
        Node next;
        
        public Node(int value){
            this.value = value;
        }
    } 
}
