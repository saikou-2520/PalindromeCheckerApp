public class UC3_StringReverse {

    public static void check(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("UC3: " + input + " is a Palindrome");
        } else {
            System.out.println("UC3: " + input + " is NOT a Palindrome");
        }
    }
}