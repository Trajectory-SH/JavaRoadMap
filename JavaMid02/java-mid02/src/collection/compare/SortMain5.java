package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSetNonNaturalOrder = new TreeSet<>(new IdComparator());
        treeSetNonNaturalOrder.add(myUser1);
        treeSetNonNaturalOrder.add(myUser2);
        treeSetNonNaturalOrder.add(myUser3);

        System.out.println("IdComparator 정렬");
        System.out.println(treeSetNonNaturalOrder);


        //자바의 정렬 알고리즘은 매우 복잡하고 거의 완성형에 가깝다.

        // 개발자가 복잡한 정렬 알고리즘은 신경쓰지 않으면서
        // 정렬이 기준만 간단하게 변경할 수 있게 인터페이스 제공
        //Comparable을 통해서 기본 자연 순서를 제공하고
        //추가적으로 다른 정렬기준이 필요하다면 Comparator을 제공하면 된다.
    }

}
