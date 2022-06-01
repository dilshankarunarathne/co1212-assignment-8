package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackChecker {
    private static Stack<Character> charStack ;
    private static int length;

    static {
        charStack = new Stack<>();
    }

    public static boolean checkIfPalindrome (String word) {
        length = word.length();

        /*
            fill a half
            start popping
            with the rest of the elements
         */

//        if (length % 2 == 1) {  // odd    TODO check again
//            fillStack(word, length/2);
//        } else {                // even
//            fillStack(word, length/2);
//        }

        fillStack(word, length/2);

        printStack();   //TODO remove
        clearStack();

        return printResult(word, checkStack(word.substring(length/2, length)));
    }

    private static boolean checkStack(String substring) {
    }

    private static void fillStack(String word, int limit) {
        fillStack(word.substring(0, limit));
//        System.out.println(limit);        TODO remove
//        System.out.println(word.substring(0, limit+1));
    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char)i)
                );
    }

    private static boolean printResult(String word, boolean palindrome) {
        System.out.print(word);
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
