package StringPracticePackage;

public class SumofIntegers {


    public static void main(String[] args) {

        String input =  "Abhin231a534v  Tiw21a3a3r19i9jhgsad8 jas356hd";
        String output = "";
        char[] strArray = input.toCharArray();
        int num = 0;
        for(int i=strArray.length-1; i>=0; i--){
            output = output + strArray[i];
            if( Character.isDigit(strArray[i])){
                num = num + Integer.parseInt(String.valueOf(strArray[i]));
            }
        }
        System.out.println(output);
        System.out.println(num);

    }
}
