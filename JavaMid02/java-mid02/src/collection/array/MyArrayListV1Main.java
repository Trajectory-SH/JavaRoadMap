package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {


        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("==데이터 추가하기==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용하기==");
        System.out.println("list.size(): " + list.size());//list 객체 참조로 멤버 변수 size에 접근
        System.out.println("list.get(1): " + list.get(1));//인덱스로 바로 접근
        System.out.println("list.indexOf('c'): " + list.indexOf("c"));//index 0 부터 해당 리스트의 size-1 까지 동등성 검사
        System.out.println("list.set(2, 'z'), oldValue: " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("범위 초과해보기");
        list.add("d");
        list.add("e");
        System.out.println(list);

        list.add("f");
        System.out.println(list);
    }
}
