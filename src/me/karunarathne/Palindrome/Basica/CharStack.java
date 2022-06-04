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

    public Character pop() {
        if (size == 0) {
            return null;
        }
        headNode.prev.next = null;
        headNode = headNode.prev;
        size -- ;
        return headNode.next.data;
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
