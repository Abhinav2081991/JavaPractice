package ExceptionPractice;

public class TestClassForException {

    public static void main(String[] args) {
        int i =10;

        try{
            if(i>5){
                throw new CustomException("Custom Exception");
            }
        }catch (CustomException e){
            System.out.println(e.getMessage()+ "test");
            System.out.println(e.testException("hellp"));
        }

    }


}
