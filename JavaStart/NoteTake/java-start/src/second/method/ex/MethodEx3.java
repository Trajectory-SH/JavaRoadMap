package second.method.ex;

import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("초기 자금을 입력해주세요: ");
        int balance = Integer.parseInt(scanner.nextLine());

        balance = depositAmount(1000, 10000);

        balance = withdrawAmount(2000, balance);
    }

    private static int withdrawAmount(int withdraw, int balance) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }

    private static int depositAmount(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
}
