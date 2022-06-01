package me.karunarathne.Palindrome;

public class Main {
    public static void main(String[] args) {
        stackTests();
        queueTests();
    }

    private static void queueTests() {
        System.out.println("------------------------------");
        System.out.println("         Q2-Queue");
        QueueChecker.checkIfPalindrome("srilanka");
        QueueChecker.checkIfPalindrome("madam");
        QueueChecker.checkIfPalindrome("hannah");
        QueueChecker.checkIfPalindrome("rocketman");
    }

    private static void stackTests() {
        System.out.println("------------------------------");
        System.out.println("         Q1-Stack");
        StackChecker.checkIfPalindrome("srilanka");
        StackChecker.checkIfPalindrome("madam");
        StackChecker.checkIfPalindrome("hannah");
        StackChecker.checkIfPalindrome("rocketman");
    }
}
