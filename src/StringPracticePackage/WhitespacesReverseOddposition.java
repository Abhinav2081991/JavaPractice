package StringPracticePackage;

public class WhitespacesReverseOddposition {


    public static void main(String[] args) {
        String input = "    abhinav    tiwari   is   a    good programmer     ";
        System.out.println(input);

        String strWithoutWhiteSpaces = input.replaceAll("\\s+", " ");
        System.out.println(strWithoutWhiteSpaces);
        StringBuilder str = new StringBuilder(strWithoutWhiteSpaces);
        String strRev = String.valueOf(str.reverse());
        System.out.println(strRev);

        char[] ch = strRev.toCharArray();
        String output = "";
        for(int i =0;i <ch.length; i++){
            if(i%2!=0){
                output = output+ch[i];
            }
        }
        System.out.println(output);

    }
}
