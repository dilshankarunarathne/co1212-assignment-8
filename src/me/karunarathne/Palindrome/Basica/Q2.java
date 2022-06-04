package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q2 {
    private static CharQueue queue ;
    private static Scanner scanner ;
    private static String inputString ;
    private static int strLen ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        stack = new CharStack();
        populateStack(readInput());
        strLen = inputString.length();
        printResult(checkIfPalindrome());
    }
}
