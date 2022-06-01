package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackNQueueChecker {
    private static Stack<Character> charStack;
    private static CharQueue charQueue;

    public static boolean checkIfPalindrome(String word) {
    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char) i)
                );
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
