package me.karunarathne.Palindrome.Basica;

public class CharQueue {
    private Node headNode;
    private int size;

    private static class Node {
        char data;
        Node next;
        Node prev;

        public Node(char data) {
            this.data = data;
        }

        public Node(char data, Node prev) {
            this.data = data;
            this.prev = prev;
            prev.next = this;
        }
    }
}
