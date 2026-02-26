public class UC1_PalindromeChecker {
    public static void main(String[] args) {
        // 1. Hardcoded string (The word to check)
        String original = "madam";
        String reverse = "";

        // 2. Logic to reverse the string
        // We loop through the word backwards and build a new string
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // 3. Check if original is equal to reverse
        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
