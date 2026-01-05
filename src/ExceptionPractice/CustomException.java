package ExceptionPractice;

public class CustomException extends Exception{

    public CustomException(String message){
        super(message);
    }

    public CustomException(){
        super();
    }

    public CustomException(String message, Throwable cause){
        super(message,cause);
    }

    public boolean testException(String message){
        System.out.println("Test custom exception message." + message);
        return false;
    }




}
