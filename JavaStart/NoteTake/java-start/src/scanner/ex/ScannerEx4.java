package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {//사용자 단수 입력 구구단출력

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int dan = scan.nextInt();
        System.out.println(dan + "단의 구구단:");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " x " + i + " = " + (i * dan));
        }
    }
}
