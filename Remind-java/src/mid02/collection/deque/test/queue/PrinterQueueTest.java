package mid02.collection.deque.test.queue;

import java.util.ArrayDeque;

public class PrinterQueueTest {
    public static void main(String[] args) {
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        /*출력 : Doc1
        출력 : Doc2
        출력 : Doc3*/
        printQueue.offerFirst("doc1");
        printQueue.offerFirst("doc2");
        printQueue.offerFirst("doc3");

        System.out.println("출력: " + printQueue.pollLast());
        System.out.println("출력: " + printQueue.pollLast());
        System.out.println("출력: " + printQueue.pollLast());


    }
}
