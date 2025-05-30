package collection.link_01;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("--데이터 추가하기--");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);


        System.out.println("--기능 사용--");
        System.out.println("list size = " + list.size());
        System.out.println("list get = " + list.get(1));
        System.out.println("list indexOf = "+list.indexOf("c"));
        System.out.println("list indexOf = "+list.indexOf("e"));
        System.out.println("list set, oldValue 출력= "+list.set(2,"z"));
        System.out.println(list);

        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);

    }
}
