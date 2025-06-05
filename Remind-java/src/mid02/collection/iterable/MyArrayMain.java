package mid02.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {

        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("Iterator 사용하기");
        while (iterator.hasNext()) {
            Integer nextValue = iterator.next();
            System.out.println("nextValue = " + nextValue);
        }
    }
}
