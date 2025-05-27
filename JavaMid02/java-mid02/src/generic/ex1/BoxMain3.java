package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        //생성시점에 T의 타입을 결정한다.

        integerBox.set(10);
        //Integer type만 허용한다.

        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();//IDE에서 어두운 글씨로 표시했다는 것은...
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 타입 전부 다 사용이 가능하다.
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.2);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

    }
}
