package mid02.collection.deque;

import java.util.ArrayDeque;

public class QueueMain {

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("poll() = " + queue.poll());
        System.out.println("poll() = " + queue.poll());
        System.out.println("poll() = " + queue.poll());
        System.out.println(queue);

    }
}
