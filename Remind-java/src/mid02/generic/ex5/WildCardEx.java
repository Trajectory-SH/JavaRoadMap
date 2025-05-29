package mid02.generic.ex5;

import mid02.generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("box.get() = " + box.get());
    }

    static void printWildCardV1(Box<?> box) {
        System.out.println("?= " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 : "+ t.getName());

        System.out.println("ㅇ");
    }
}
