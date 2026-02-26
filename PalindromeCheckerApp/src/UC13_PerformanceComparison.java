import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class UC13_PerformanceComparison {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        input = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Input: " + input);
        System.out.println("----------------------------------");

        measurePerformance("Reverse String", () -> reverseMethod(input));
        measurePerformance("Stack Method", () -> stackMethod(input));
        measurePerformance("Deque Method", () -> dequeMethod(input));
        measurePerformance("Recursive Method", () -> recursiveMethod(input));
    }

    // 1️⃣ Reverse String Method
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // 2️⃣ Stack Method
    public static boolean stackMethod(String input) {
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

    // 3️⃣ Deque Method
    public static boolean dequeMethod(String input) {
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

    // 4️⃣ Recursive Method
    public static boolean recursiveMethod(String input) {
        return isPalindrome(input, 0, input.length() - 1);
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    // 5️⃣ Performance Measurement Utility
    public static void measurePerformance(String methodName, Runnable method) {

        long startTime = System.nanoTime();

        method.run();

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println(methodName + " Execution Time: "
                + duration + " ns");
    }
}