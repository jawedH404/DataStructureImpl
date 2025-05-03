public class Main{

    public static void main(String[] args) throws CustomStackException {
        CustomStackArray csa = new CustomStackArray();
        // System.out.println(csa.isFull());
        // System.out.println(csa.isEmpty());
        csa.push(10);
        csa.push(20);
        csa.push(30);
        csa.push(40);
        csa.push(50);
        // csa.push(60);  // STACK IS FULL

        int r = csa.pop();
        System.out.println(r);  // 50

        System.out.println(csa.peek());  // 40
        System.out.println(csa.peek()); // 40

        csa.traverse();

        csa.delete();
        System.out.println(csa.peek());  // Error



        // DynamicCustomStackArray dcsa = new DynamicCustomStackArray(5); 
        // dcsa.push(10);
        // dcsa.push(20);
        // dcsa.push(30);
        // dcsa.push(40);
        // dcsa.push(50);
        // dcsa.push(60);
        // dcsa.push(70);
        
        // System.out.println(dcsa.peek()); //70
        // System.out.println(dcsa.peek()); // 70
        // System.out.println(dcsa.pop());  // 70
        // System.out.println(dcsa.peek());  // 60

  

    }
}