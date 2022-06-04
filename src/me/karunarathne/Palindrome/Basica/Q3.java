package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q3 {
    private static CharStack stack;
    private static CharQueue queue;
    private static String inputString;
    private static Scanner scanner;
    private static int strLen;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        queue = new CharQueue();

        populate(readInput());
        strLen = inputString.length();



        printResult(checkIfPalindrome());
    }

    private static String readInput() {
        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();
        return inputString.substring(0, inputString.length()/2);
    }

    private static void populate(String input) {
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
