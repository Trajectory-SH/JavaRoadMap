package mid02.collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //Set 인터페이스의 메서드를 참고해보자

//        orSet(set1, set2);
//        andSet(set1, set2);
        minusSet(set1, set2);
    }

    private static void minusSet(Set<Integer> set1, Set<Integer> set2) {
        Object[] temp = new Object[10];
        Object[] array1 = set1.toArray();
        Object[] array2 = set2.toArray();
        for (Object num1 : array1) {
            for (Object num2 : array2) {
                if (num1.equals(num2)) {
                    set1.remove(num2);
                }
            }
        }
        System.out.println("차집합: " + set1);
    }

    private static void andSet(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> temp = new HashSet<>();
        Object[] array1 = set1.toArray();
        Object[] array2 = set2.toArray();
        for (Object num1 : array1) {
            for (Object num2 : array2) {
                if (num1.equals(num2)) {
                    temp.add((Integer) num2);
                }
            }
        }
        System.out.println("교집합: " + temp);
    }

    private static void orSet(Set<Integer> set1, Set<Integer> set2) {
        Object[] array = set2.toArray();
        for (Object i : array) {
            set1.add((Integer)i);
        }
        System.out.println("합집합: " + set1);
    }
}
