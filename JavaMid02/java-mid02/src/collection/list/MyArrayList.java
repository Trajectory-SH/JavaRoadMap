package collection.list;

import java.util.Arrays;

public class  MyArrayList<T> implements MyList<T> {


    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    //elementData(arrayList)의 실제 크기를 반환하는 메서드
    @Override
    public int size() {
        return size;
    }

    //elementData[size] -> 해당 배열의 맨 뒤에 추가하기-> O(1)
    @Override
    public void add(T element) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = element;
        size++;
    }

    //index 중간에 추가하기
    @Override
    public void add(int index, T element) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = element;
        size++;
    }

    //요소의 마지막부터 Index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    //배열의 사이즈를 동적으로 늘린다.
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        return (T) elementData[index];
    }

    @Override
    public T set(int index, T element) {
        T oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public T remove(int index) {
        T oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;

        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        System.out.println("해당 값을 발견하지 못했습니다..");
        return -1;
    }

    @Override
    public String toString() {

        return Arrays.toString(Arrays.copyOf(elementData, size)) + "size = " + size + ", capacity= " + elementData.length;
    }
}
