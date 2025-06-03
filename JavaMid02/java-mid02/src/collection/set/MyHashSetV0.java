package collection.set;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        //검증 로직
        if (contains(value)) {//O(n)
            return false;
        }
        //실제 동작 기능 로직 분리
        elementData[size] = value;
        size++;
        return true;
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
