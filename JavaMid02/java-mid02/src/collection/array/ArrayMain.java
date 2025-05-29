package collection.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //인덱스 입력 : O(1)
        System.out.println("배열 자동 초기화");
        System.out.println(Arrays.toString(arr));
        //선언만 하면 각각의 element를 자동으로 초기화해준다.
        System.out.println();

        System.out.println("인덱스 입력 O(1)");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("인덱스 변경 O(1)");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println();

        System.out.println("인덱스 접근 조회 O(1)");
        System.out.println("arr[2] = " + arr[2]);
        System.out.println();

        System.out.println("배열 검색 O(n)");
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
            if(arr[i]==value){
                System.out.println(value+ " 탐색 완료!");
                break;
            }

        }

    }
}
