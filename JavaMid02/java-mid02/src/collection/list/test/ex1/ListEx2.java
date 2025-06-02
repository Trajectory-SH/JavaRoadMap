package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요(종료 0)");
        while (true) {
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum != 0) {
                list.add(inputNum);
                continue;
            } else {
                System.out.println("==출력==");
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size() - 1) {
                        System.out.print(list.get(i));
                        System.out.print(", ");
                    } else {
                        System.out.println(list.get(i));
                    }
                }
            }
            break;

        }

    }
}
