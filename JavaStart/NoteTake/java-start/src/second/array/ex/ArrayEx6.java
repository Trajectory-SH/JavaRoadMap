package second.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("입력받은 숫자의 개수를 입력하세요: ");
        int inputNum = scanner.nextInt();

        System.out.println(inputNum + "개의 정수를 입력하세요:");
        int[] arr = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxValue = arr[0];
        int minValue = arr[0];

        for (int j : arr) {
            if (maxValue < j) {
                maxValue = j;
            }
            if (minValue > j) {
                minValue = j;
            }
        }
        System.out.println("가장 작은 정수: " + minValue);
        System.out.println("가장 큰 정수: " + maxValue);
    }
}
