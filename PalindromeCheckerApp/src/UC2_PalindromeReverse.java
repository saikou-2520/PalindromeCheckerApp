public class UC2_PalindromeReverse {
    public static void main(String[] args) {
        // 1. Hardcoded string to check
        String str = "radar";
        String reversed = "";

        // 2. Loop to reverse the string
        // We start from the last index (length - 1) and move to 0
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i); // String concatenation
        }

        // 3. Compare and display result
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}