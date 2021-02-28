package oximix.datsStructures.linkedList;

public class LinkedList<T> {

    private Node<T> head;

    void addFirst(T t) {
        Node<T> firstNode = new Node<T>(t);
        firstNode.next = head;
        head = firstNode;
    }

    void addLast(T t) {
        if (head == null) {
            head = new Node<T>(t);
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<T>(t);
    }

    int get(T t) {
        if (head == null) {
            return -1;
        }

        if (head.value == t) {
            return 0;
        }

        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            ++result;
            if (currentNode.next.value == t) {
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    void remove(T t) {
        if (head == null) {
            return;
        }

        if (head.value == t) {
            head = head.next;
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == t) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                "}";
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value + "," +
                    "next=" + next +
                    "}";
        }
    }
}
