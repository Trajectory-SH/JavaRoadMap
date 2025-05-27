package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        integerBox.set("answ");

        if (integerBox.get() instanceof Integer) {
            Integer result = (Integer) integerBox.get();

            System.out.println("result = " + result);
        }else {
            System.out.println("DownCasting에 실패했습니다...");
        }


    }
}
