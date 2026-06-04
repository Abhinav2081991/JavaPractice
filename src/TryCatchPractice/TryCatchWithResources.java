package TryCatchPractice;

import java.io.*;

public class TryCatchWithResources {

    public static void main(String[] args) {
        testMethod();

//        WebDriver doesn’t implement AutoCloseable, so try-with-resources is not applicable.

        /* Better Example - DB Connection.
        * try (
    Connection conn = dataSource.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery()
) {
    // DB validation
}

* ❓ Difference between AutoCloseable & Closeable?
        Closeable extends AutoCloseable and throws only IOException.

❓ Is finally executed in try-with-resources?
        Yes, after resources are closed.

❓ Can close() throw checked exception?
        Yes, but it will be suppressed.

❓ Is try-with-resources faster?
Slightly, due to fewer checks and cleaner bytecode.
*
*
* 1️⃣ What is a Suppressed Exception? (INTERVIEW ANSWER)
        A suppressed exception is an exception that occurs during resource cleanup (usually in close()),
        * but is not thrown directly because another exception was already thrown in the try block.
*
*
* 5️⃣ KEY RULES (INTERVIEW GOLD)
🔑 Rule 1
    The exception from the try block is always the primary exception.

🔑 Rule 2
    Exceptions from close() are suppressed, not thrown.

🔑 Rule 3
    Suppressed exceptions are accessible via:
    Throwable[] getSuppressed()
*
*/
    }


     public static void testMethod(){

         try(BufferedReader br =  new BufferedReader(new FileReader("test.txt"))){
                br.readLine();
                while(br.readLine() !=null){
                    br.read();
                }
             throw new RuntimeException("Exception Occurred");
        // here the connection will be closed automatically without even closing in the finally block.
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }
}
