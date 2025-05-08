package first.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process process) {
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }

    private static class Dice implements Process {//내부 클래스로 선언

        @Override
        public void run() {
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위= " + randomVal);
        }
    }
    private static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i= " + i);
            }
        }
    }
    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();
        dice.run();
        sum.run();
    }
}
