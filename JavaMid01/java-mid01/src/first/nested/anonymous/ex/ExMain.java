package first.nested.anonymous.ex;

import java.util.Random;

public class ExMain {
    public static void helloDice() {
        System.out.println("메서드 시작");

        //코드 조각
        int randomVal = new Random().nextInt(6)+1;
        System.out.println("주사위= " + randomVal);
        //코드 조각 끝
        // 이 코드 조각 자체를 넘길 수 있는 방법이 없으려나...

        System.out.println("메서드 종료");

    }

    public static void helloSum() {
        System.out.println("메서드 시작");

        //코드 조각
        for (int i = 1; i <= 3; i++) {
            System.out.println("i= " + i);
        }
        //코드 조각 끝
        System.out.println("메서드 종료");

    }

    public static void main(String[] args) {
        helloDice();
        helloSum();

    }
}
