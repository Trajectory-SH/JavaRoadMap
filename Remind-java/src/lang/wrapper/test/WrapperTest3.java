package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        //Integer로 변환
        Integer intStr = Integer.parseInt(str);
        System.out.println("integer1 = " + str);

        //Integer를 int로 변환 -> 객체를 기본형으로
        int intValue = intStr.intValue();
        System.out.println("intvalue = " + intValue);

        //int Integer로 변환해서 출력
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);

    }
}
