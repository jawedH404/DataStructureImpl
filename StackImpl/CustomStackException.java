public class CustomStackException  extends Exception{
    
    private String message;

    public CustomStackException(String message){
        // super(message);
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;

    }

}
