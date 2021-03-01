package oximix.datsStructures.queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Reek: " + queue.peek());

        queue.dequeue();
        System.out.println("Reek: " + queue.peek());

        queue.dequeue();
        System.out.println("Reek: " + queue.peek());

        queue.dequeue();
        System.out.println("Reek: " + queue.peek());

        queue.dequeue();
        System.out.println("Reek: " + queue.peek());
    }
}
