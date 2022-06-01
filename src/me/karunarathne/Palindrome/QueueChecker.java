package me.karunarathne.Palindrome;

import java.util.Queue;

public class QueueChecker {
    private static Queue charQueue;

    public static boolean checkIfPalindrome(String word) {
        charQueue = new CharQueue(word.substring(0, word.length()/2));

        printQueue();
        return false;
    }

    private static void printQueue() {
        charQueue.forEach(
                i -> System.out.println((char) i)
        );
    }
}
