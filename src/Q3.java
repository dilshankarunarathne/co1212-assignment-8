import java.util.Scanner;

public class Q3 {
    private static CharStack stack;
    private static CharQueue queue;
    private static String inputString;
    private static Scanner scanner;
    private static int strLen;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        stack = new CharStack();
        queue = new CharQueue();
        populate(readInput());
        printResult(checkIfPalindrome());
    }

    private static boolean checkIfPalindrome() {
        for (int i=0; i<strLen/2; i++) {
            if (queue.dequeue() != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    private static void printResult(boolean isPalindrome) {
        System.out.print(inputString + " is");
        if (!isPalindrome) {
            System.out.print(" not");
        }
        System.out.println(" a palindrome.");
    }

    private static String readInput() {
        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();
        return inputString;
    }

    private static void populate(String input) {
        inputString = input;
        strLen = input.length();
        input.substring(0, inputString.length()/2).chars().forEach(
                character -> stack.push((char) character)
        );
        if (strLen % 2 == 1) {  // odd
            inputString.substring((strLen/2)+1, strLen).chars().forEach(
                    character -> queue.enqueue((char) character)
            );
        } else {                // even
            inputString.substring(strLen/2, strLen).chars().forEach(
                    character -> queue.enqueue((char) character)
            );
        }
    }
}
