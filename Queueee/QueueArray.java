public class QueueArray{
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    private static final int DEFAULT_SIZE = 10;
  
    public QueueArray(){
      this(DEFAULT_SIZE);
    }
  
    public QueueArray(int size) {
      this.arr = new int[size];
      this.topOfQueue = -1;
      this.beginningOfQueue= -1;
      System.out.println("The Queue is succesffully created with size of: " + size);
    }

    public boolean isFull(){
        return topOfQueue == arr.length-1;
    }

    public boolean isEmpty(){
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    // Inserting at end
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }

        else if (isEmpty()){
            beginningOfQueue = 0;

            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" in the Queue");
        }
        else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" in the Queue");
        }
    }

    // Delete from first 
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }
        else{
            int res = arr[beginningOfQueue];
            beginningOfQueue++;
            
            // if one element is present and deleted by above then we have to recover the structure
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return res;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }
        else{
            return arr[beginningOfQueue];
        }

    }

    public void delete(){
        arr = null;
        System.out.println("Queue is successsfully deeted");
    }

    public void display(){
        if(arr == null  || arr.length == 0 ){
            System.out.println("Queue does not exist");
        }else if (isEmpty()){
            System.out.println("Queue is Empty ");
        }
        
        else{   
        for(int i = beginningOfQueue; i<= topOfQueue; i++){
            System.out.print(arr[i]+"  ");
            }
        System.out.println();
        }
    }

}