package first.nested.remind.network.refactoring.anonymous;

import java.util.Random;

public class Anonymous_01 {

    //정적 함수 생성 : 생성자(public)+클래스 이름으로 어디에서나 접근이 가능하다.
    public static void hello(Processs process) {
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }
    //어차피 아래와 같이 한 번만 기능을 정의해서 사용할거면 굳이 클래스로 만들지 않아도 되지 않을까?
    static class Dice implements Processs {
        @Override
        public void run() {
            int ranVal = new Random().nextInt(6) + 1;
            System.out.println("주사위= " + ranVal);
        }
    }

    static class Sum implements Processs {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Processs a = new Dice();
        Processs b = new Sum();

        System.out.println("hello 실행 다형성");
        a.run();
        b.run();
    }

}
