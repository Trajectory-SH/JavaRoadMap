package remind01.memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    private static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);//Data 타입의 주소값을 받을 수 있는 참조변수 data1을 선언하고 동시에 Data 클래스의
//        인스턴스를 생성했습니다...
        method2(data1);
        System.out.println("method1 end");

    }

    private static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data2 = " + data2.getValue());
        System.out.println("method2 end");
    }
}
