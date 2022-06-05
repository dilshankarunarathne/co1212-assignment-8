import java.util.Scanner;

public class Q1 {
    private static CharStack stack ;
    private static Scanner scanner ;
    private static String inputString ;
    private static int strLen ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        stack = new CharStack();
        populateStack(readInput());
        strLen = inputString.length();
        printResult(checkIfPalindrome());
    }

    private static void printResult(boolean isPalindrome) {
        System.out.print(inputString + " is");
        if (!isPalindrome) {
            System.out.print(" not");
        }
        System.out.println(" a palindrome.");
    }

    private static boolean checkIfPalindrome() {
        String slice;
        if (strLen % 2 == 1) {  // odd
            slice = inputString.substring((strLen/2)+1, strLen);
        } else {                // even
            slice = inputString.substring(strLen/2, strLen);
        }

        for (int i=0; i<slice.length(); i++) {
            if (slice.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    private static void populateStack(String input) {
        input.chars().forEach(
                character -> stack.push((char) character)
        );
    }

    private static String readInput() {
        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();
        return inputString.substring(0, inputString.length()/2);
    }
}
