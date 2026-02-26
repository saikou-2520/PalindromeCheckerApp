public class UC9_Recursive {

    public static void check(String input) {

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("UC9: " + input + " is a Palindrome");
        } else {
            System.out.println("UC9: " + input + " is NOT a Palindrome");
        }
    }

    // Recursive Method
    private static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }
}