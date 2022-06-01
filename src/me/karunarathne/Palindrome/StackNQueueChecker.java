package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackNQueueChecker {
    private static Stack<Character> charStack;
    private static CharQueue charQueue;
    private static int length;

    static {

    }

    public static boolean checkIfPalindrome(String word) {
        length = word.length();
        clearAll();

        fillStack(word.substring(0, word.length()/2));


        fillQueue(word.substring(word.length()/2, word.length()));

        charQueue = new CharQueue();

        return printResult(word, compare());
    }

    private static boolean compare() {

    }

    private static void fillQueue(String word) {

    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char) i)
                );
    }

    private static void clearAll() {
        if(charStack.equals(null)) {
            charStack = new Stack<>();
        } else {
            charStack.clear();
        }
        if(charQueue.equals(null)) {
            charQueue = new CharQueue();
        } else {
            charQueue.clear();
        }
    }

    private static boolean printResult(String word, boolean palindrome) {
        System.out.print(word + " is");
        if (!palindrome) {
            System.out.print(" not");
        }
        System.out.println(" a palindrome.");
        return palindrome;
    }
}
