package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {

        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
    }
     //-1,0,1을 return 해주면 java에서 값을 가져다 쓰면서 정렬을 해준다.
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1);
            System.out.println("o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }
}
