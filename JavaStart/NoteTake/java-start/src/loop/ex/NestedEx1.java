package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        System.out.println("====구구단을 외자====");
        for (int x = 1; x < 10; x++) {
            System.out.println("===="+x+"단====");
            for (int y = 1; y < 10; y++) {
                System.out.println(x+" * "+ y+" = " +(x*y));
            }
        }
        System.out.println("====구구단 프로그램 종료====");
    }
}
