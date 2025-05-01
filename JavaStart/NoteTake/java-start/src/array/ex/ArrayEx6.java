package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scan.nextInt();
        System.out.println(count + "개의 정수를 입력하세요: ");

        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        //강의에서는 조금 더 짧고 가독성이 좋게 max값과 min값을 받았다... 두 코드 확인해보기
        for (int i = 0; i < arr.length; i++) {
            if (min <= arr[i]) {
                continue;
            }
            min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (max >= arr[i]) {
                continue;
            }
            max = arr[i];
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
