package StringPracticePackage;

public class ReplacingNumerics {


    public static void main(String[] args) {
         String str = "jkhk1k456jh45kjjadkjh3434jksdfj34534";

         str = str.replaceAll("[0-9]", "");
//        str = str.replaceAll("[0-9]", "Test");
//        str = str.replaceAll("[0-9]", "o");
//        str = str.replaceAll("[0-9]", "123");


        System.out.println(str);


    }
}
