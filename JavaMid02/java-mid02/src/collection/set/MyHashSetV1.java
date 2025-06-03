package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public int getSize() {
        return size;
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        //linkedlist remove 메서드 -> 객체를 지우는 것, 인덱스 위치를 지우는 것 오버로딩 되어있음.
        boolean result = bucket.remove(Integer.valueOf(value));
        //command + p 로 parameter를 확인할 수 있다.
        //index로 지우는 것이 아님..!
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
               "buckets=" + Arrays.toString(buckets) +
               ", size=" + size +
               ", capacity=" + capacity +
               '}';
    }

    private int hashIndex(int value) {
        return value % capacity;
    }
}
