package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력해주세요 (종료 0)");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        int total = 0;

        for (Integer integer : list) {
            total += integer;
        }

        double average = (double) total / list.size();


        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);


        
    }
}
