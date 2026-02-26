import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class UC12_StrategyPattern {

    // 1️⃣ Strategy Interface
    interface PalindromeStrategy {
        boolean check(String input);
    }

    // 2️⃣ Stack Strategy Implementation
    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

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

    // 3️⃣ Deque Strategy Implementation
    static class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean check(String input) {

            Deque<Character> deque = new ArrayDeque<>();

            for (char ch : input.toCharArray()) {
                deque.addLast(ch);
            }

            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) {
                    return false;
                }
            }

            return true;
        }
    }

    // 4️⃣ Context Class
    static class StrategyPalindromeChecker {

        private PalindromeStrategy strategy;

        public StrategyPalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }

    // 5️⃣ Main Method
    public static void main(String[] args) {

        String word = "madam";

        // Use Stack Strategy
        StrategyPalindromeChecker checker =
                new StrategyPalindromeChecker(new StackStrategy());

        System.out.println("Using Stack Strategy: "
                + checker.execute(word));

        // Change strategy at runtime
        checker.setStrategy(new DequeStrategy());

        System.out.println("Using Deque Strategy: "
                + checker.execute(word));
    }
}