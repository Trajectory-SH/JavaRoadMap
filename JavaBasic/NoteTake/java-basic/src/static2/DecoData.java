package static2;

public class DecoData {

    //멤버변수 목록(인스턴스 변수, 클래스 변수)이 존재
    private int instanceValue;
    private static int staticValue;


    public static void staticCall() {
        staticValue++;//정적 변수 접근
        staticMethod();//정적 메서드 접근

        DecoData newData = new DecoData();
        newData.instanceValue++;
        newData.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue="+instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue="+staticValue);
    }


}
