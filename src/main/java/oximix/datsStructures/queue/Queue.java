package oximix.datsStructures.queue;

class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    void enqueue(T t) {
        Node<T> node = new Node<T>(t);
        if (head == null) {
            head = node;
        }

        if (tail != null) {
            tail .next = node;
        }
        tail = node;
    }

    void dequeue() {
        head = head.next;

        if (head == null) {
            tail = null;
        }
    }

    T peek() {
        if (head == null) {
            return null;
        }

        return head.value;
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
