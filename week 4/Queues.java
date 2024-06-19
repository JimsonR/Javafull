import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue =  new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.element());


        Deque deque = new ArrayDeque();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.pollLast());
        System.out.println(deque.element());

    }
}
