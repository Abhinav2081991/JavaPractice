package TryCatchPractice;

import java.io.*;

public class TryCatchWithResources {

    public static void main(String[] args) {
        testMethod();
    }


     public static void testMethod(){

         try(BufferedReader br =  new BufferedReader(new FileReader("test.txt"))){

             throw new RuntimeException("Exception Occurred");
        // here the connection will be closed automatically without even closing in the finally block.
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }
}
