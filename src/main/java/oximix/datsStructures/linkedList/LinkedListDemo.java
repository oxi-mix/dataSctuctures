package oximix.datsStructures.linkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println("LL:" + linkedList);

        linkedList.addFirst(4);
        System.out.println("LL:" + linkedList);

        System.out.println("Index of el with value 2:" + linkedList.get(2));
        System.out.println("Index of el with value 5:" + linkedList.get(5));

        linkedList.remove(3);
        System.out.println("LL:" + linkedList);
    }
}
