package me.karunarathne.Palindrome;

public class Main {
    public static void main(String[] args) {

    }

    private static void queueTests() {
        QueueChecker.checkIfPalindrome()
        StackChecker.checkIfPalindrome("srilanka");
        StackChecker.checkIfPalindrome("madam");
        StackChecker.checkIfPalindrome("hannah");
        StackChecker.checkIfPalindrome("rocketman");
    }

    private static void stackTests() {
        StackChecker.checkIfPalindrome("srilanka");
        StackChecker.checkIfPalindrome("madam");
        StackChecker.checkIfPalindrome("hannah");
        StackChecker.checkIfPalindrome("rocketman");
    }
}
