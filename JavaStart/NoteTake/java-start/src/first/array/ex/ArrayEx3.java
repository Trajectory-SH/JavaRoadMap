package first.array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력해주세요: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("출력");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }

        System.out.println();
        System.out.println("===The End===");

    }
}
