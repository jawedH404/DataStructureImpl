
/*
 * 
So basically the reason that we need circular queue is that when we are implementing linear queue using array,
dequeue method causes blank cells over here.
So this is not space efficient solution.
That's why to make these blank cells reusable, we need circular queue and in this case, we have to do it
in a way that the time complexities are not changed.
 */
public class CircularQueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueueArray(){
        this(DEFAULT_SIZE);
    }

    public CircularQueueArray(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue is Successfully Created with size of "+size);
    }

    public boolean isEmpty(){
        return beginningOfQueue == -1;
    }


    public boolean isFull(){
        if(topOfQueue + 1 == beginningOfQueue){   // It checks if it complete Cycle then T is just back of B
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue + 1 == size){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("CQ is Full ");
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesfully Inserted "+value+" in the queue");
        }
        else{
            if(topOfQueue +1 == size){
                topOfQueue = 0;
            }else{
                topOfQueue ++;
            }
            arr[topOfQueue] = value;
            System.out.println("Succesfully Inserted "+value+" in the queue");
        }
    }



    public int deQueue(){
        if(isEmpty()){
            System.out.println("The CQ is Empty ");
            return -1;
        }
        else{
            int res = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;    // Optional i.e So visually, the 0 helps you see that slot [0] is no longer in use

            if(beginningOfQueue == topOfQueue){   // This handles the last element being dequeued
                beginningOfQueue = topOfQueue = -1;
            }
            else if(beginningOfQueue + 1 == size){
                beginningOfQueue = 0;     // this maintain the cycle mean cycle ti the start
            }
            else{
                beginningOfQueue++;     // for all other cases, move forward
            }
            return res;
        }
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("CQ is Empty ");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }

    public void delete(){
        arr = null;
        System.out.println("Queue is successfully Deleted");
    }


    public void display(){
        if(arr == null ){
            System.out.println("CL is Not exist ");
        }else if(isEmpty()){
            System.out.println("CQ is Empty ");
        }

        else{
            int i = beginningOfQueue;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == topOfQueue) {  //The loop stops when it reaches topOfQueue.
                    break;
                }
                i = (i + 1) % arr.length; // wrap around  i.e wraps back to 0 after reaching the end.
            }
        
            System.out.println();
        }
    }
}
