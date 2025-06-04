package mid02.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    //실제 JAVA에서 사용하는 hashSet 기본 capacity
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;//해당 필드가 왜 필요한지?
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    //DEFAULT capacity로 HashSet 생성
    public MyHashSetV1() {
        initBuckets();
    }

    //USER capacity로 HashSet 생성
    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    //자료구조(HashSet buckets 초기화)
    private void initBuckets() {
        buckets = new LinkedList[capacity];//지정한 용량만큼 링크드리스트를 요소로 같는 배열 buckets 생성
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();//각각의 해시 인덱스에 동적으로 사이즈가 변할 수 있는 링크드 리스트 생성 후 할당
        }
    }
    //값 추가
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        //검증 로직
        if (bucket.contains(value)) {
            return false;
        }

        //정상 흐름 분리
        bucket.add(value);
        size++;
        return true;
    }
    //해시인덱스 생성 for LinkedList 자료구조에 접근
    private int hashIndex(int value) {
        return value % capacity;
    }

    //값이 들어있는지 확인
    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    //값 제거
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));//remove 메서드의 오버로딩으로 인한 문제.
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
               "buckets=" + Arrays.toString(buckets) +
               ", size=" + size +
               '}';
    }
}
