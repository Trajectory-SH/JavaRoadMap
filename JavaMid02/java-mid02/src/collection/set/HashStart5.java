package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //LinkedList를 element로 하는 Array buckets 생성
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        //타입 이레이저로 인해서 생성자에서는 Generic 사용이 불가능
        //컴파일 시점에서 DownCasting을 알아서 해준다.
        // 그럼에도 불구하고 위의 코드가 가능한 이유는 input type이 정해져 있기 때문

        for (int i = 0; i < CAPACITY; i++) {
            //Arrays buckets에 LinkedList 각각 할당
            buckets[i] = new LinkedList<>();
            //buckets[i]에 할당되는 변수들을 보고 type inference를 통해서 <Integer>생략이 가능하다.
        }


        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        add(buckets, 1);
        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains..? " + searchValue + " = " + contains);
        System.out.println(contains(buckets, 10));
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {

        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        } else {
            System.out.println(value + "값이 중복되어 bucket에 추가되지 않았답니다.");
        }
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
