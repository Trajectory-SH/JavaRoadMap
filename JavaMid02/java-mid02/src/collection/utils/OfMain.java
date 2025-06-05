package collection.utils;

import java.util.List;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        //편리한 불변 컬렉션

        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 3, 4);
        //Map.of 도 있음
        System.out.println("list class = " + list.getClass());//ImmutableCollections의 내부 클래스  $ListN

        //왜 불변 컬렉션을 만드는 것일까? ->UnsupportedOperationException




    }
}
