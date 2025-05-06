package first.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = scan.nextInt();


        int[] arr = new int[num];

        System.out.println(num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int total = 0;
        for (int value : arr) {
            total += value;
        }
        double avg = (double) total / arr.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);

    }
}
