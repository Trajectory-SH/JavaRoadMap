package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {//이름 나이 입력받고 출력하기

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요: ");
        String name = scan.nextLine();
        System.out.print("당신의 나이를 입력하세요: ");
        int age = scan.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, " + "나이는 " + age + "살입니다.");
    }
}
