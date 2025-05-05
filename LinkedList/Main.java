package LinkedList;

public class Main{

    public static void main(String[] args) {
        // SinglyLinkedListt ll = new SinglyLinkedListt();
        // ll.insertFirst(1);
        // ll.insertFirst(5);
        // ll.insertFirst(7);
        // ll.insertFirst(10);
        // ll.insertLast(99);
        // ll.insert(50, 3);
        // ll.display();
        // ll.deleteFirst();
        // ll.display();
        // ll.deleteLast();
        // ll.display();
        // System.out.println(ll.delete(2));;
        // ll.display();
        // System.out.println(ll.find(1));

        // DoublyLinkedList ll = new DoublyLinkedList();
        // ll.insertFirst(1);
        // ll.insertFirst(5);
        // ll.insertFirst(7);
        // ll.insertFirst(10);
        // ll.insertLast(20);
        // ll.insertLast(30);
        // ll.insertAfterValue(20,99);
        // ll.display();
        // ll.displayReverse();


        CLL ll = new CLL();
        ll.insert(1);
        ll.insert(5);
        ll.insert(7);
        ll.insert(10);
        ll.display();
        ll.delete(7);
        ll.display();


    }

    
}