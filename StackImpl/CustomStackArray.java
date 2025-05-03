
public class CustomStackArray {
    public int[] arr;
    private int topOfStack;
    private static final int DEFAULT_SIZE = 10;

    public CustomStackArray(){
        this(DEFAULT_SIZE);
    }

    public CustomStackArray(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is Created with size of "+size);
    }

    // isEmpty
    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull(){
        if(topOfStack == arr.length-1){
            // System.out.println("The Stack is full ");
            return true;
        } else {
            return false;
        }
    }

    // push 
    public void push (int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("value is inserted successfully ");
        }
    }

    // pop
    public int pop() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("Stack is Empty");
        }
        else {
            // int element = arr[topOfStack];
            // topOfStack --;

            // return element;   
            return arr[topOfStack--];
        }
    }

    // peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is Empty ");
            return -1;
        }
        else{
            return arr[topOfStack];
        }
    }

    // delete
    public void delete(){
        arr = null;
        System.out.println("The Stack is successfully deleted ");
    }

    // traverse
    public void traverse(){
        System.out.println("Traversing Stack");
        for(int i = topOfStack; i >=0; i--){
            System.out.print(arr[i]+" - ");
        }
        System.out.println();
    }
    
}
