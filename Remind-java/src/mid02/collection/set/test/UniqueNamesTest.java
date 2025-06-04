package mid02.collection.set.test;

import java.util.HashSet;
import java.util.List;

public class UniqueNamesTest {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};

        HashSet<Integer> set = new HashSet<>();
       /* set.addAll(List.of(inputArray));
        System.out.println(set);*/

        for (Integer i : inputArray) {
            set.add(i);
        }
        System.out.println(set);

    }
}
