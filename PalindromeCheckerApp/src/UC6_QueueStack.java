import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UC6_QueueStack {

    public static void check(String input) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC6: " + input + " is a Palindrome");
        } else {
            System.out.println("UC6: " + input + " is NOT a Palindrome");
        }
    }
}