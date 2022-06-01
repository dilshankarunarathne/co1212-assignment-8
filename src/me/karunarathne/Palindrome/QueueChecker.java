package me.karunarathne.Palindrome;

import java.util.Queue;

public class QueueChecker {
    private static Queue charQueue;

    public static boolean checkIfPalindrome(String word) {
        charQueue = new CharQueue(word.substring(0, word.length()/2));

        printQueue();   // TODO remove
        return false;
    }

    private static boolean printResult(String word, boolean palindrome) {
        System.out.print(word + " is");
        if (!palindrome) {
            System.out.print(" not");
        }
        System.out.println(" a palindrome.");
        return palindrome;
    }

    private static void printQueue() {
        charQueue.forEach(
                i -> System.out.println((char) i)
        );
    }
}
