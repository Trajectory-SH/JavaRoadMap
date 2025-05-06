package first.cond.ex;

import java.util.Scanner;

public class ExcangeRateEx {//"환율 계산하기 프로그램"

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("환전하실 금액을 입력해주세요 : ");
        int dollar = scan.nextInt();
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}
