package first.loop.ex;

import java.util.Scanner;

public class WhileEx3 {//누적합 계산

    public static void main(String[] args) {
        //while
        Scanner scan = new Scanner(System.in);
        System.out.print("Max 값을 입력해주세요: ");
        int max = scan.nextInt();
        int counter = 0;
        int sum = 0;
        System.out.println("=====While=====");
        while (counter <= max) {
            sum = sum + counter;//sum += counter
            counter++;
        }
        System.out.println("max = " + max);
        System.out.println("누적합 = " + sum);


        //for
        System.out.println("=====For=====");
        int sum1 = 0;
        for (int i = 0; i <= max; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("max = " + max);
        System.out.println("누적합 = " + sum1);
    }
}
