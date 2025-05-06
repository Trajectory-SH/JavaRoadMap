package first.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {//이름과 나이 반복

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scan.nextLine();

            if (name.equals("종료")) {
                System.out.println("====이름 나이 입력프로그램 종료====");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = Integer.parseInt(scan.nextLine());


            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }


    }
}
