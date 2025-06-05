package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //전략패턴을 구현 -> Arraylist의 특수 메서드를 사용할때만 ArrayList 타입으로 받는다.
        //리스트 인터페이스에 집중 구현체는 나중에 갈아끼우면 됨

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //Collection과 관련된 다양한 편의기능들을 Static 메서드로 제공
        //Comparalble 정렬을 통해서 max min값을 가져온다.
        Integer max = Collections.max(list);
        System.out.println("max = " + max);

        Collections.shuffle(list);//랜덤하게 요소들을 섞어준다.
        System.out.println("Shuffle list = " + list);//카드게임 같은 곳에서! 사용하면 좋겠구만

        Collections.sort(list);//list.sort()가 더 좋다.
        Collections.reverse(list);
        System.out.println("list = " + list);



    }
}
