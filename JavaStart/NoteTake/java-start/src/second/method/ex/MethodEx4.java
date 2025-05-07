package second.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        boolean stopFlag = false;
        int balance = 0;
        while (!stopFlag) {
            int choiceNum = setMenu();
            switch (choiceNum) {
                case 1:
                    balance = deposit(balance);
                    break;
                case 2:
                    balance = withdraw(balance);
                    break;
                case 3:
                    System.out.println("현재잔액: " + balance);
                    break;
                case 4:
                    stopFlag = true;
                    System.out.println("시스템을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 메뉴 번호를 다시 입력해주세요(1~4)");
                    break;
            }
        }

    }

    private static int withdraw(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int amount = Integer.parseInt(scanner.nextLine());
        if (amount > balance) {
            System.out.println(amount + "원을 출금하려고 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }

    private static int deposit(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int amount = Integer.parseInt(scanner.nextLine());
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. " + "현재 잔액: " + balance);
        return balance;
    }

    private static int setMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료 ");
        System.out.println("-------------------------------------");
        System.out.print("메뉴를 선택해주세요: ");
        return Integer.parseInt(scanner.nextLine());

    }
}
