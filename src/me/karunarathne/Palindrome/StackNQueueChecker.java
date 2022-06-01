package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackNQueueChecker {
    private static Stack<Character> charStack;
    private static CharQueue charQueue;
    private static int length;

    static {
        charStack = new Stack<>();
        charQueue = new CharQueue();
    }

    public static boolean checkIfPalindrome(String word) {
        length = word.length();
        clearAll();

        fillStack(word.substring(0, length / 2));

        if (length % 2 == 1) {
            charQueue = new CharQueue(word.substring((length/2)+1, length));
        } else {
            charQueue = new CharQueue(word.substring(length / 2, length));
        }

        return printResult(word, compare());
    }

    private static boolean compare() {
        for (int i = 0; i < length / 2; i++) {
            if (charStack.pop() != charQueue.deQueue()) {
                return false;
            }
        }
        return true;
    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char) i)
                );
    }

    private static void clearAll() {
        charStack.clear();
        charQueue.clear();
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
