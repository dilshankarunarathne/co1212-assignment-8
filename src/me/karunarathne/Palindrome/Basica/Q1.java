package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q1 {
    private static CharStack stack ;
    private static Scanner scanner ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        stack = new CharStack();
        populateStack(readInput());
    }

    private static String readInput() {
        return scanner.nextLine();
    }
}
