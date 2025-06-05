package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        //불변 객체는 새로 객체를 생성해서 return값을 받아서 사용하게된다.
        System.out.println("mutable list = " + mutableList.getClass());

        //다시 불변 리스트로
        Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(mutableList);
//        unmodifiableCollection.add(5);//예외 발생!

        System.out.println("unmodifiableCollection = " + unmodifiableCollection.getClass());


    }
}
