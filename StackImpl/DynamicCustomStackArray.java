public class DynamicCustomStackArray extends CustomStackArray{
    
    public DynamicCustomStackArray(){
        super();     // This will call CustomStackArray()
    }

    public DynamicCustomStackArray(int size){
        super(size);    // This will call CustomStackArray(int size)
    }

    @Override
    public void push(int value) {
    
        if(this.isFull()){
            // double the array size
            int[] temp = new int[arr.length * 2];

            // copy all previous items in new data
            for(int i = 0; i < arr.length; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        
        // At this point we know that array is not full
        // Insert item
        super.push(value);

    }

}
