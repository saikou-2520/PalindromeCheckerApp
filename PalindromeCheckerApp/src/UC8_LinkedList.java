public class UC8_LinkedList {

    // Node class (Singly Linked List)
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void check(String input) {

        // Step 1: Convert String to Linked List
        Node head = null;
        Node tail = null;

        for (char ch : input.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find Middle using Fast & Slow Pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse Second Half
        Node secondHalf = reverse(slow);

        // Step 4: Compare First Half and Reversed Second Half
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Step 5: Print Result
        if (isPalindrome) {
            System.out.println("UC8: " + input + " is a Palindrome");
        } else {
            System.out.println("UC8: " + input + " is NOT a Palindrome");
        }
    }

    // Helper Method to Reverse Linked List
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}