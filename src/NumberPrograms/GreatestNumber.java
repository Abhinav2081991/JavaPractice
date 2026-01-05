package NumberPrograms;

public class GreatestNumber {

    public static void main(String[] args) {
         int a =  5;
         int b = 9;
         int c = 7;

         if (a>b && a>c){
             System.out.println(a + " is greatest ");
         }else if (b>a && b>c){
             System.out.println(b + "is greatest");
         }else{
             System.out.println(c + " is greatest");
         }

    }
}
