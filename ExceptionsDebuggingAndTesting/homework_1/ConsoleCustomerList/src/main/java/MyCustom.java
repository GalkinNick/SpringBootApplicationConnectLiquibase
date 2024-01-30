public class MyCustom extends Exception{
    public MyCustom(String message){
        super(message);
    }

    public MyCustom(String message, Throwable cause){
        super(message, cause);
    }
}
