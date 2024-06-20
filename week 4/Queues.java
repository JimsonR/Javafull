import java.util.*;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<String> queue =  new PriorityQueue<>();
//        queue.add("Welcome");
//        queue.add("To");
//        queue.add("Geeks");
//        queue.add("4");
//        queue.add("Geeks");
//
//        // Displaying the PriorityQueue
//        System.out.println("Initial PriorityQueue: " + queue);
//
//        // Inserting using offer()
//        queue.offer("The");
//        queue.offer("Priority");
//        queue.offer("Class");
//
//        // Displaying th final Queue
//        System.out.println("Priority queue after Insertion: " + queue);
        queue.add("Abc");
        queue.add("Bcd");
        queue.add("Def");
        queue.add("Cde");
        System.out.println(queue);
        queue.offer("E");
        queue.offer("C");
        queue.offer("Abc");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        Queue<Integer> queue2 =  new PriorityQueue<Integer>();
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(5);
        queue2.add(4);
        System.out.println(queue2);
        queue2.offer(6);




        Deque deque = new ArrayDeque();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.add("D");
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.peek());
        System.out.println(deque.pollLast());
        System.out.println(deque.element());
//        deque.removeLast();
//        deque.addFirst("E");
//        deque.addFirst("F");
//        System.out.println(deque);
//        System.out.println(deque.peek());
//
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);



    }
}
