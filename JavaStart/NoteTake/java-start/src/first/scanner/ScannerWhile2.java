package first.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==가산 프로그램을 시작합니다==");
        while (true) {
            System.out.print("첫 번째 수를 입력해주세요: ");
            int num1 = scan.nextInt();
            System.out.print("두 번째 수를 입력해주세요: ");
            int num2 = scan.nextInt();
            int sum = num1 + num2;
            if (num1 == 0 && num2 == 0) {
                System.out.println("종료 조건을 입력하셨습니다.");
                System.out.println("프로그램을 종료하겠습니다.");
                break;
            } else {
                System.out.println("입력하신 두 수의 합은 :" + sum);
            }
        }


    }
}
