package StringPracticePackage;

public class ReplaceSpaces {


    public static void main(String[] args) {
        String str = "aasd f w fw 3 wf ac c qw qwe adasd a qweq wsdfd sd";
        System.out.println(str);
//        str =str.replace(" ", "");
        // OR
        str =str.replaceAll("\\s+", "");


        System.out.println(str);
    }
}
