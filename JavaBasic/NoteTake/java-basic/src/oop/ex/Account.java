package oop.ex;

import java.util.Scanner;

public class Account {
    //멤버변수(클래스<정적,static> 변수, 인스턴스 변수)
    int balance;
    int amount;


    void setBalacne() {
        Scanner scan = new Scanner(System.in);
        System.out.print("초기 자금을 입력해주세요: ");
        balance = Integer.parseInt(scan.nextLine());
    }

    int deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금 되었습니다. ");
        System.out.println("잔고: " + balance);
        return balance;
    }

    void withdraw(int amount) {

        if (amount > balance) {
            System.out.println("계좌에 잔고가 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount+"원이 출금되었습니다.");
            System.out.println("잔고: " + balance);
        }

    }


}
