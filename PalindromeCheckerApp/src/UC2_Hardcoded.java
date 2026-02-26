public class UC2_Hardcoded {

    public static void check() {

        String word = "madam";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println("UC2: " + word + " is a Palindrome");
        } else {
            System.out.println("UC2: " + word + " is NOT a Palindrome");
        }
    }
}