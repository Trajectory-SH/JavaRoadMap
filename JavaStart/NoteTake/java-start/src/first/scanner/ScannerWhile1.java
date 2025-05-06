package first.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("사용자 문자열을 입력해주세요(종료: exit) -> ");
            String input = scan.nextLine();
            if (input.equals("exit")) {
                System.out.println("====시스템을 종료합니다.====");
                break;
            } else {
                System.out.println("====사용자 문자열을 출력합니다====");
                System.out.println(input);
                System.out.println("===========================");
            }


        }
    }

}
