package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackChecker {
    private static Stack<Character> charStack ;
    private static int length;

    static {
        charStack = new Stack<>();
    }

    public static boolean isPalindrome (String word) {
        length = word.length();
        fillStack (word);

//        printStack();

        clearStack();

        return false;
    }

    private static void clearStack() {
        charStack.clear();
    }

    private static void printStack() {
        charStack.forEach(
                        i -> System.out.println((char)i)
                );
    }

    private static void fillStack(String word) {
        word.chars()
                .forEach(
                        i -> charStack.push((char)i)
                );
    }
}
