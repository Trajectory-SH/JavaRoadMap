package first.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        //변수선언
        Scanner scan = new Scanner(System.in);
        boolean stopFlag = false;
        int account = setAccount();
        //메뉴
        while (!stopFlag) {

            //메뉴 생성 및 메뉴 번호 선택하기
            printMenu();
            System.out.print("선택: ");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {

                case 1://입금
                    account = deposit(account);
                    break;

                case 2://출금
                    account = withdraw(account);
                    break;

                case 3://잔액 확인
                    System.out.println("현재 잔액: " + account);
                    break;

                case 4://종료
                    stopFlag = true;
                    System.out.println("시스템을 종료합니다.");
                    break;

                default:
                    break;
            }


        }

        //switch-case
//        입금
//        출금
//        잔액확인
//        종료
    }

    //계좌 초기화
    public static int setAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("초기 자금을 설정해주세요: ");
        return Integer.parseInt(scan.nextLine());
    }

    //메뉴 보여주기
    public static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
    }

    //입금
    public static int deposit(int account) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입금액을 입력해주세요: ");
        int deposit = Integer.parseInt(scan.nextLine());
        account += deposit;
        System.out.println(deposit + "원을 입금하였습니다. 현재 잔액: " + account + "원");
        return account;
    }

    //출금
    public static int withdraw(int account) {
        Scanner scan = new Scanner(System.in);
        System.out.print("출금액을 입력해주세요: ");
        int withdraw = Integer.parseInt(scan.nextLine());

        if (withdraw > account) {
            System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            account -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + account + "원");
        }
        return account;
    }
}
