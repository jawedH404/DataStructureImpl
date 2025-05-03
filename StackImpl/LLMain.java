public class LLMain {

    public static void main(String args[]){

        StackLinkedList sll = new StackLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);

        System.out.println(sll.size());     //4
        sll.display();                  //40 30 20 10
        System.out.println(sll.pop());
        System.out.println(sll.size());     //3
        System.out.println(sll.isEmpty());   // false
        System.out.println(sll.peek());       // 30
    }
    
}
