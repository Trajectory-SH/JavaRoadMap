package basic.access.ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        LinkedList<Object> objects = new LinkedList<>();
        int[] students = new int[3];
        int capacity = 10;
        LinkedList<Integer>[] bucket = new LinkedList[capacity];

        LinkedList<Object> objects1 = new LinkedList<>();
        objects1.add(123);
        System.out.println(objects1.get(0));

        int count = counter.getCount();
        System.out.println(count);
    }
}
