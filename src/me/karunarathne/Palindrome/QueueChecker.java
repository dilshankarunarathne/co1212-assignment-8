package me.karunarathne.Palindrome;

public class QueueChecker {
    private static CharQueue charQueue ;
    private static int length ;

    static {
        charQueue = new CharQueue();
    }

    public static boolean checkIfPalindrome(String word) {
        charQueue.clear();
        length = word.length();
        charQueue = new CharQueue(word.substring(0, length/2));

        return printResult(word, checkQueue(word));
    }

    private static boolean checkQueue(String word) {
        String slice = word;
        if (length % 2 == 1) {  // odd
            slice = word.substring((length/2)+1, length);
        } else {                // even
            slice = word.substring(length/2, length);
        }

        for (int i=slice.length()-1; i>=0; i--) {
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
