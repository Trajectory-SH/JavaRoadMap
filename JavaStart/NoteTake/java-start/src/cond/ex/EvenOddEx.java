package cond.ex;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요: ");
        int x = scan.nextInt();
//        System.out.println("x: " + x);
//        if (x % 2 == 0) {
//            System.out.println("출력 x = " + x + ", 짝수");
//        }else {
//            System.out.println("출력 x = " + x + ", 홀수");
//        }
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
