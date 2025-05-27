package start.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int inputNum = Integer.parseInt(scanner.nextLine());
        int[] inputArr = new int[inputNum];

        System.out.println("3개의 정수를 입력하세요: ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(scanner.nextLine());
        }

        int  minNum = inputArr[0];
        int  maxNum = inputArr[0];
        for (int i : inputArr) {
            if (i > maxNum) {
                maxNum = i;
            }
            if (i < minNum) {
                minNum = i;
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);


    }
}
