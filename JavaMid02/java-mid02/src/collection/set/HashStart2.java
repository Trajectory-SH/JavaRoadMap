package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("input Array = " + Arrays.toString(inputArray));

        int searchValue = 8;
        //데이터와 index를 일치시켜버렸기 때문에 indexing을 통해서 O(1)로 접근
        Integer result = inputArray[searchValue];
        System.out.println(result);
    }
}
