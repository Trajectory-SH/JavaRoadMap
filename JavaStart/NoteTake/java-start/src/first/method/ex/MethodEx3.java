package first.method.ex;

import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //초기자금
        System.out.print("초기 자금을 입력해주세요: ");
        int balance = Integer.parseInt(scan.nextLine());

        //입금
        System.out.print("입급 금액을 입력해주세요: ");
        int depositAmount = Integer.parseInt(scan.nextLine());

        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");


        //출금
        System.out.print("출금 금액을 입력해주세요: ");
        int withDrawAmount = Integer.parseInt(scan.nextLine());
        if (balance <= withDrawAmount) {
            System.out.println("계좌에 잔고가 부족합니다.");
        } else {
            balance -= withDrawAmount;
            System.out.println(withDrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }

        System.out.println("====================");
        System.out.println("최종 잔액: " + balance + "원");

    }
}
