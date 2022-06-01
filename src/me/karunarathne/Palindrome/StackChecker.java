package me.karunarathne.Palindrome;

import java.util.Stack;

public class StackChecker {
    private static Stack<Character> charStack ;

    static {
        charStack = new Stack<>();
    }

    public static boolean isPalindrome (String word) {
        fillStack (word);
        
        printStack();

        return false;
    }

    private static void fillStack(String word) {
//        word.chars()
//                .forEach(
//                        i -> System.out.println((char)i)
//                );
        word.chars()
                .forEach(
                        i -> charStack.push((char)i)
                );
    }
}
