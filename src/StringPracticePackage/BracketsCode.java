package StringPracticePackage;

public class BracketsCode {


    public static boolean check(String str) {
        // Base case: if the string is empty or null, it is correct
        if (str == null || str.isEmpty()) {
            return true;
        }

        // Check if the string starts with '(' and ends with ')'
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            // Recursively check the substring inside the parenthesis
            return check(str.substring(1, str.length() - 1));
        }

        // Check if the string starts with '[' and ends with ']'
        if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            // Recursively check the substring inside the brackets
            return check(str.substring(1, str.length() - 1));
        }

        // Check if the string can be split into two correct strings
        for (int i = 1; i < str.length(); i++) {
            if (check(str.substring(0, i)) && check(str.substring(i))) {
                return true;
            }
        }

        // If none of the conditions are satisfied, return false
        return false;
    }

    public static void main(String[] args) {
        // Test the check method
        System.out.println(check("(())")); // true
        System.out.println(check("([)]")); // false
        System.out.println(check("([()])")); // true
    }
}
