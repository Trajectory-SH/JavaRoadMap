package first.scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {//사이숫자

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번쨰 숫자를 입력해주세요: ");
        int num1 = scan.nextInt();
        System.out.print("두 번쨰 숫자를 입력해주세요: ");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) {
            if (i == num2) {
                System.out.print(i);
                break;
            }
            System.out.print(i + ",");
        }
    }
}
