package me.karunarathne.Palindrome.Basica;

public class CharStack {
    private Node headNode;
    private int size;

    public CharStack() {
        size = 0;
    }

    public void push(char character) {
        if (size == 0) {
            headNode = new Node(character);
        } else {
            headNode = new Node(character, headNode);
        }
        size ++ ;
    }
    private class Node {
        char head;
        Node next;
        Node prev;

        public Node(char head) {
            this.head = head;
        }

        public Node(char head, Node prev) {
            this.head = head;
            this.prev = prev;
        }
    }
}
