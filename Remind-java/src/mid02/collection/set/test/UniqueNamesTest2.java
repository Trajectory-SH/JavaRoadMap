package mid02.collection.set.test;

import java.util.LinkedHashSet;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }
        for (Integer i : set) {
            System.out.print(i+" ");
        }
        }
    }
