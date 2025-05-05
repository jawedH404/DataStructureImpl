public class MainC {
    public static void main(String[] args) {
        CircularQueueArray cs = new CircularQueueArray(3);
        System.out.println(cs.isEmpty());
        System.out.println(cs.isFull());
        cs.enQueue(1);
        cs.enQueue(2);
        cs.enQueue(3);
        cs.enQueue(10);
        System.out.println(cs.isEmpty());
        System.out.println(cs.isFull());
        cs.display();
        System.out.println(cs.deQueue());
        cs.display();
        cs.enQueue(5);
        cs.display();
        System.out.println("peek  " +cs.peek());
        System.out.println(cs.deQueue());
        System.out.println("peek  " +cs.peek());
        cs.display();
        cs.deQueue();
        cs.display();
        cs.deQueue();
        cs.display();

    }
}

/*
Queue is Successfully Created with size of 3
true
false
Succesfully Inserted 1 in the queue
Succesfully Inserted 2 in the queue
Succesfully Inserted 3 in the queue
CQ is Full
false
true
1 2 3
1
2 3
Succesfully Inserted 5 in the queue
2 3 5
peek  2
2
peek  3
3 5
5
CQ is Empty
 */
