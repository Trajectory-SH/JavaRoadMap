package mid02.collection.compare;

import java.util.Arrays;
import java.util.TreeSet;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        //System.out.println(array); 이렇게 출력하면 객체의 참조값을 출력한다.

        System.out.println(Arrays.toString(array));
        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
