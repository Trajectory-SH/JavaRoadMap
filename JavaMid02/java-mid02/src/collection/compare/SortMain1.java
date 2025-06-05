package collection.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {

        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //처음부터 끝까지 비교하는 과정을 거친다.
        //가장 단순하고 성능이 좋지 않은 정렬 알고리즘(퀵소트-자바 초기)
        //data 32개 이하 듀얼 피벗 퀵소트 -> 데이터가 많을 때 팀소트 O(n log n)

        //역정렬을 하기위해서는 어떻게 해야하는가? 비교 기준 직접 제공

    }
}
