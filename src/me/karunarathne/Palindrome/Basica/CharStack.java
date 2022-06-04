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
        char temp;
        if (size == 0) {
            return null;
        } else if (size == 1) {
            temp = headNode.data;

        } else {
            temp = headNode.data;
            headNode.prev.next = null;
            headNode = headNode.prev;
        }

        size -- ;
        return temp;
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
