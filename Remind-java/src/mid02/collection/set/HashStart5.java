package mid02.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //기본 자료구조 틀 만들기
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();//LinkedList<Integer> 타입의 element를 배열에 할당
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println(searchValue + "가 존재하나요? "+ contains);
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];//hashIndex를 통해서 어느 LinkedList에 넣을지 결정 O(1)
        //중복되는 값이 없으면 bucket에 value추가
        if (!bucket.contains(value)) {//linkedList의 멤버 메서드 contains()
            bucket.add(value);
        }
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
