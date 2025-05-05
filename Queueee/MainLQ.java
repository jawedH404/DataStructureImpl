public class MainLQ {
    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        System.out.println(ql.isEmpty());
        ql.enQueue(1);
        ql.enQueue(2);
        System.out.println(ql.isEmpty());
        System.out.println("size "+ql.size);
        ql.deQueue();
        System.out.println("size "+ql.size);
        ql.display();
        System.out.println("Peek "+ql.peek());
        ql.deleteQueue();
        // ql.deQueue();
        System.out.println("Peek "+ql.peek());
         ql.display();

    }
}

/**
Queue is created 
true
Inserted 1 successfully in Queue
Inserted 2 successfully in Queue
false
size 2
size 1
Traversing queue
2
Peek 2
Queue is Deleted
Peek -1
Queue is empty
 */
