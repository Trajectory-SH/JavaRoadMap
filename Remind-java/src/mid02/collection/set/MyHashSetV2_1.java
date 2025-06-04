package mid02.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2_1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    //Object 타입을 받는 LinkedList를 element로 갖는 배열 buckets
    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2_1() {
        initBuckets();
    }

    public MyHashSetV2_1(int capacity) {
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];//링크리스트를 type으로 갖는 배열을 capacity size로 생성
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();//타입추론으로 다이아몬드 연산자에 알아서 타입이 할당된다.
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        //검증로직 분리
        if (bucket.contains(value)) {
            return false;
        }

        //정상 흐름
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    public boolean remove(Object removeValue) {
        int hashIndex = hashIndex(removeValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(removeValue);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
        //해시코드는 음수가 나올 수 있기 때문에 Math.abs() 클래스 메서드 사용
        //hashIndex가 음수가 나올 수는 없음 -> 실제 배열의 인덱스에 할당하는 것이기 때문이다.
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2_1{" +
               "buckets=" + Arrays.toString(buckets) +
               ", size=" + size +
               ", capacity=" + capacity +
               '}';
    }
}
