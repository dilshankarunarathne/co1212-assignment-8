package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q2 {
    private static CharQueue queue ;
    private static Scanner scanner ;
    private static String inputString ;
    private static int strLen ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        queue = new CharQueue();
        populateStack(readInput());
        strLen = inputString.length();
        printResult(checkIfPalindrome());
    }

    private static void printResult(boolean isPalindrome) {
        System.out.print(inputString + " is");
        if (!isPalindrome) {
            System.out.print(" not");
        }
        System.out.println(" a palindrome.");
    }
}
