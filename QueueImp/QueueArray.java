package QueueImp;

public class QueueArray {
    
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

}
