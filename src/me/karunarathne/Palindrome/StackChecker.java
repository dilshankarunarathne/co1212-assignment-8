package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackChecker {
    private static Stack<Character> charStack ;
    private static int length;

    static {
        charStack = new Stack<>();
    }

    public static boolean checkIfPalindrome (String word) {
        clearStack();
        length = word.length();

        /*
            fill a half
            start popping
            with the rest of the elements
         */


        fillStack(word, length/2);

        return printResult(word, checkStack(word));
    }

    private static boolean checkStack(String word) {
        String slice;
        if (length % 2 == 1) {  // odd
            slice = word.substring((length/2)+1, length);
        } else {                // even
            slice = word.substring(length/2, length);
        }

        for (int i=0; i<slice.length(); i++) {
            if (slice.charAt(i) != charStack.pop()) {
                return false;
            }
        }
        return true;
    }

    private static void fillStack(String word, int limit) {
        fillStack(word.substring(0, limit));
    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char)i)
                );
    }

    private static boolean printResult(String word, boolean palindrome) {
        System.out.print(word + " is");
        if (!palindrome) {
            System.out.print(" not");
        }
        System.out.println(" a palindrome.\n");
        return palindrome;
    }

    private static void clearStack() {
        charStack.clear();
    }

    private static void printStack() {
        charStack.forEach(
                i -> System.out.println((char)i)
        );
    }
}
