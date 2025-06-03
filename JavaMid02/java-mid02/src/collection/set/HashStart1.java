package collection.set;

import java.util.ArrayList;
import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        //해시 알고리즘을 사용하면 데이터 검색 성능을 평균 O(1)수준으로 끌어올릴 수 있다.

        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue) {

                System.out.print("검색한 숫자 " + searchValue + "... 찾았습니다!!! " + inputValue);


            }
        }

    }
}
