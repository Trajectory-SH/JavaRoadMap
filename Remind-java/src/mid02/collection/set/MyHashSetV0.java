package mid02.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        //검증 로직
        if (contains(value)) {
            return false;
        }
        //정상 로직
        elementData[size] = value;
        size++;
        return true;
        /*else if 문을 사용해서 코드를 작성하는 것도 좋지만
        정상 흐름과 검증 흐름을 분리해서 작성하는 것이 더 명료해 보인다.
        의식적으로 코드 스타일을 개선해보자...!*/
    }

    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
               "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
               ", size=" + size +
               '}';
    }

}
