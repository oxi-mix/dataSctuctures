package oximix.datsStructures.stack;


public class Stack<T> {
    private Node<T> head;

    T peek() {
        return head.value;
    }

    T pop() {
        T value = head.value;
        head = head.next;
        return value;
    }

    void push(T t) {
        Node<T> node = new Node<T>(t);
        node.next = head;
        head = node;
    }

    boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.value);
            currentNode = currentNode.next;
        }
        return sb.toString();
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
