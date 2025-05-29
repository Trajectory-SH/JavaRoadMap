package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");
        System.out.println(numberList);

        System.out.println(numberList.get(0));
        Integer integer = (Integer) numberList.get(2);//ClassCastException
        System.out.println(numberList.get(2));
    }
}
