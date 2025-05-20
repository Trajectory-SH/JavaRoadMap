package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        //다양한 타입의 매개변수가 넘어올 수 있게 오버로딩 되어있음
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");//문자열 => 기본형

        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);



    }
}
