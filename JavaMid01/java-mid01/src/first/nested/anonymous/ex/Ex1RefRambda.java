package first.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefRambda {
    public static void hello(Process process) {
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }


    public static void main(String[] args) {
        hello(()->{
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위: " + randomVal);
                    System.out.println("test");
        }
        );

        hello(()  ->{
            for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
        });
    }
}
