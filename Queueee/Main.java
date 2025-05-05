public class Main {
    public static void main(String[] args) {
        QueueArray ques = new QueueArray(3);
        System.out.println(ques.isFull());
        System.out.println(ques.isEmpty());
        ques.enQueue(10);
        ques.enQueue(20);
        ques.enQueue(30);
        ques.enQueue(40);
        ques.enQueue(50);
        System.out.println(ques.isEmpty());
        System.out.println(ques.isFull());
        ques.display();
        System.out.println(ques.deQueue());
        System.out.println("Cheching for disadvantage of Linear Array implementation ");
        System.out.println(ques.isFull());  /// It gives True as result but the first element is deleted , Now it will not be full
        System.out.println(ques.peek());
        System.out.println(ques.deQueue());
        ques.delete();
        ques.display();
    
    }
    
}
/*
 * 
The Queue is succesffully created with size of: 3
false
true
Successfully inserted 10 in the Queue
Successfully inserted 20 in the Queue
Successfully inserted 30 in the Queue
Queue is Full
Queue is Full
false
true
10  20  30
10
Cheching for disadvantage of Linear Array implementation
true
20
20
Queue is successsfully deeted
Queue does not exist
 */
