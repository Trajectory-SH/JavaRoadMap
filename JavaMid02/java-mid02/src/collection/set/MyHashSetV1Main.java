package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);//중복
        System.out.println(set);
    }
}
