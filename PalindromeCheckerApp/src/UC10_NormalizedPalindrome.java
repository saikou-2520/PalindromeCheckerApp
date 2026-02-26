public class UC10_NormalizedPalindrome {

    public static void check(String input) {

        // Step 1: Normalize the string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Optional: Remove all non-alphanumeric characters
        normalized = normalized.replaceAll("[^a-z0-9]", "");

        // Step 2: Use two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Print Result
        if (isPalindrome) {
            System.out.println("UC10: \"" + input + "\" is a Palindrome");
        } else {
            System.out.println("UC10: \"" + input + "\" is NOT a Palindrome");
        }
    }
}