package first.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("사용자 정수 입력(0을 입력하면 종료됩니다.) >> ");
            int userInput = scan.nextInt();

            if (userInput == 0) {
                System.out.println("====시스템이 종료됩니다.====");
                break;
            } else {
                sum += userInput;
                System.out.println("지금까지의 총 합 = " + sum);
            }

        }
    }
}
