package me.karunarathne.Palindrome;

public class Main {
    public static void main(String[] args) {
        queueTests();
    }

    private static void queueTests() {
        QueueChecker.checkIfPalindrome("srilanka");
//        QueueChecker.checkIfPalindrome("madam");
//        QueueChecker.checkIfPalindrome("hannah");
//        QueueChecker.checkIfPalindrome("rocketman");
    }

    private static void stackTests() {
        StackChecker.checkIfPalindrome("srilanka");
        StackChecker.checkIfPalindrome("madam");
        StackChecker.checkIfPalindrome("hannah");
        StackChecker.checkIfPalindrome("rocketman");
    }
}
