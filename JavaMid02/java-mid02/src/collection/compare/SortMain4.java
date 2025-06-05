package collection.compare;

import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    //List와 같은 순서가 있는 자료구조에서 사용할 수 있다.
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);

        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);//왜 이렇게 설계했을까 찝찝...
        System.out.println(list);

        System.out.println("Id Comparator 정렬");
        list.sort(new IdComparator().reversed());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        //Collections 보다 list.sort()를 사용하는 것이 더 좋답니다.
        //객체가 이미 내 데이터를 갖고 있기 때문에 위와 같은 방식이 더 객체지향 스럽다
        //자바 1.8부터 사용이 가능하다.

        // Tree구조의 정렬?!
    }
}
