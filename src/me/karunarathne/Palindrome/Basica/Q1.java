package me.karunarathne.Palindrome.Basica;

import java.util.Scanner;

public class Q1 {
    private static CharStack stack ;
    private static Scanner scanner ;
    private static String inputString ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        stack = new CharStack();
        populateStack(readInput());
    }

    private static void populateStack(String input) {
        input.chars().forEach(
                character -> stack.push((char) character)
        );
    }

    private static String readInput() {
        return scanner.nextLine();
    }
}
