package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q3 {
    private static CharStack stack;
    private static CharQueue queue;
    private static String inputString;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        queue = new CharQueue();
        populateStack(readInput());
        strLen = inputString.length();
        printResult(checkIfPalindrome());
    }
}
