package me.karunarathne.Palindrome;

import java.util.Queue;

public class QueueChecker {
    private static CharQueue charQueue;
    private static int length ;

    public static boolean checkIfPalindrome(String word) {
        length = word.length();
        charQueue = new CharQueue(word.substring(0, length/2));

//        System.out.println(charQueue.deQueue());
//        System.out.println(charQueue.deQueue());
//        System.out.println(charQueue.deQueue());


        printResult(word, checkQueue(word));
        printQueue();   // TODO remove
        return false;
    }

    private static boolean checkQueue(String word) {
        String slice;
        if (length % 2 == 1) {  // odd
            slice = word.substring((length/2)+1, length);
        } else {                // even
            slice = word.substring(length/2, length);
        }

        for (int i=0; i<slice.length(); i++) {
            if (slice.charAt(i) != charQueue.deQueue()) {
                return false;
            }
        }
        return true;
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
