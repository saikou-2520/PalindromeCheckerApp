import java.util.ArrayDeque;
import java.util.Deque;

public class UC7_DequeBased {

    public static void check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC7: " + input + " is a Palindrome");
        } else {
            System.out.println("UC7: " + input + " is NOT a Palindrome");
        }
    }
}