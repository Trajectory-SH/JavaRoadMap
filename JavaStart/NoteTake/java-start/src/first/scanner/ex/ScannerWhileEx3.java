package first.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {//입력한 숫자의 합계와 평균

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;//자동 형변환으로 인한 연산 주의하기
        int counter = 0;
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {
            int inputNum = scan.nextInt();
            if (inputNum == -1) {
                break;
            }
            sum += inputNum;
            counter++;
        }
        double avg = sum / counter;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);


    }
}
