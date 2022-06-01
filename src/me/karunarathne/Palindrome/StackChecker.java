package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackChecker {
    private static Stack<Character> charStack ;
    private static int length;

    static {
        charStack = new Stack<>();
    }

    public static boolean isPalindrome (String word) {
        length = word.length();

        /*
            fill a half
            start popping
            with the rest of the elements
         */

        if (length % 2 == 1) {  // odd
            fillStack(word, length/2);
        } else {                // even

        }

        printStack();
        clearStack();

        return false;
    }

    private static void fillStack(String word, int limit) {
        fillStack(word.substring(0, limit+1));
    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char)i)
                );
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
