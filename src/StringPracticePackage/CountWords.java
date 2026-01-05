package StringPracticePackage;

public class CountWords {

    public static void main(String[] args) {


        String s  = "Abh hb iuy kjh      iouoi      yiuyi           jhkkj";
        String[] strArray = s.split(" ");

        System.out.println(s.split("\\s+").length);


    }
}
