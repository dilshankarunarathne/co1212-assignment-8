package me.karunarathne.Palindrome;

import java.util.Queue;

public class QueueChecker {
    private static Queue charQueue;

    public static boolean isPalindrome(String word) {
        charQueue = new CharQueue(word.substring(word.length()/2));

        return false;
    }

    private static void printStack() {
        charQueue.forEach(
                i -> System.out.println((char) i)
        );
    }
}
