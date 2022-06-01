package me.karunarathne.Palindrome;

import java.util.Queue;

public class QueueChecker {
    private static Queue charQueue;

    public static boolean isPalindrome(String word) {
        charQueue = new CharQueue(word);
    }
}
