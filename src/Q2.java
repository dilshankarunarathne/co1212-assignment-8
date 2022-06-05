package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q2 {
    private static CharQueue queue ;
    private static Scanner scanner ;
    private static String inputString ;
    private static int strLen ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        queue = new CharQueue();
        populateStack(readInput());
        strLen = inputString.length();
        printResult(checkIfPalindrome());
    }

    private static boolean checkIfPalindrome() {
        String slice;
        if (strLen % 2 == 1) {  // odd
            slice = inputString.substring((strLen/2)+1, strLen);
        } else {                // even
            slice = inputString.substring(strLen/2, strLen);
        }

        for (int i=slice.length()-1; i>=0; i--) {
            if (slice.charAt(i) != queue.dequeue()) {
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
        return inputString.substring(0, inputString.length()/2);
    }

    private static void populateStack(String input) {
        input.chars().forEach(
                character -> queue.enqueue((char) character)
        );
    }
}
