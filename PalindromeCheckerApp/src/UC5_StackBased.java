import java.util.Stack;

public class UC5_StackBased {

    public static void check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (input.equals(reversed)) {
            System.out.println("UC5: " + input + " is a Palindrome");
        } else {
            System.out.println("UC5: " + input + " is NOT a Palindrome");
        }
    }
}