package StringPracticePackage;

public class ReplaceVowels {

    public static boolean isVowel(char c){
        boolean vowel = false;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            vowel = true;
        }else{
            vowel = false;
        }
        return vowel;
    }

    public static void main(String[] args) {

        String input = "icecream";
        char c[] = input.toCharArray();
        int left = 0;
        int right = input.length()-1;

        while(left < right){

            while(left <right && !isVowel(c[left])){
                left++;
            }

            while(left <right && !isVowel(c[right])){
                right--;
            }

            char temp = c[left];
            c[left]=c[right];
            c[right] = temp;
            left++;
            right--;


        }

        System.out.println(new String(c));


    }
}
