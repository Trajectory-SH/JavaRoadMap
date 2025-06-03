package mid02.collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println("hashIndex(1) = " + hashIndex(1));
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex];
        System.out.println(result);

    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);//value를 통해서 hashIndex를 생성 O(1)
        inputArray[hashIndex] = value;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
