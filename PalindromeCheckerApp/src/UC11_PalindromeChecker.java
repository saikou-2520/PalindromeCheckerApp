public class UC11_PalindromeChecker {

    // Public method (Encapsulation)
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Internal logic (using stack for demonstration)
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}