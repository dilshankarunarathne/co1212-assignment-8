package me.karunarathne.Palindrome.Basica;

public class CharQueue {
    private Node headNode;
    private int size;

    public CharQueue() {
        size = 0;
    }

    public void enqueue(char character) {
        if (size == 0) {
            headNode = new Node(character);
        }

        size ++ ;
    }

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
