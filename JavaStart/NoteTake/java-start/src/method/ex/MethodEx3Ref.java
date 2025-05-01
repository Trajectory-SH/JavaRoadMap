package method.ex;

import java.util.Scanner;

public class MethodEx3Ref {
    public static void main(String[] args) {


        int balance = setBalnce();
        balance = deposit(balance);
        balance = withdraw(balance);
        printAccount(balance);


    }

    public static int setBalnce() {
        Scanner scan = new Scanner(System.in);
        System.out.print("초기 자금을 입력해주세요: ");
        return Integer.parseInt(scan.nextLine());

    }

    public static int deposit(int balance) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입급 금액을 입력해주세요: ");
        int depositAmount = Integer.parseInt(scan.nextLine());
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        scan.close();
        return balance;
    }

    public static int withdraw(int balance) {
        Scanner scan = new Scanner(System.in);
        System.out.print("출금 금액을 입력해주세요: ");
        int withDrawAmount = Integer.parseInt(scan.nextLine());
        if (balance <= withDrawAmount) {
            System.out.println("계좌에 잔고가 부족합니다.");
        } else {
            balance -= withDrawAmount;
            System.out.println(withDrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        return balance;

    }

    public static void printAccount(int balance) {
        System.out.println("====================");
        System.out.println("최종 잔액: " + balance + "원");
    }

}
