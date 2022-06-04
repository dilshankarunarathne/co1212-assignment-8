package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q3 {
    private static CharStack stack;
    private static CharQueue queue;
    private static String inputString;
    private static Scanner scanner;
    private static int strLen;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        queue = new CharQueue();

        populateStackNQueue(readInput());
        strLen = inputString.length();



        printResult(checkIfPalindrome());
    }

    private static void populateStackNQueue(String input) {
        
    }
}
