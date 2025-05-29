package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {

        MyArrayListV3 list = new MyArrayListV3(2);
        list.add("a");
        list.add("b");
        System.out.println(list);
        list.add(3,"hello");
        System.out.println(list);
        System.out.println(list.elementData.length);
        list.add(3,"hello");
        System.out.println(list);

    }
}
