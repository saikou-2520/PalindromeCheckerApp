public class UC4_CharArray {

    public static void check(String input) {

        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC4: " + input + " is a Palindrome");
        } else {
            System.out.println("UC4: " + input + " is NOT a Palindrome");
        }
    }
}