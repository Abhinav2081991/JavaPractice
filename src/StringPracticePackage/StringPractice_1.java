package StringPracticePackage;

public class StringPractice_1 {

    public static void testString_1(){
        String input = "ABCxyz";
        StringBuilder output = new StringBuilder();
        char[] inputChar = input.toCharArray();
        for( char c : inputChar){
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            output.append(c);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        testString_1();
    }


}
