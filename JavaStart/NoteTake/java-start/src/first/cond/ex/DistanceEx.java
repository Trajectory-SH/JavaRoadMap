package first.cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distace = scan.nextInt();

        if (distace <= 1) {
            System.out.println("distance: " + distace);
            System.out.println("출력 : 도보를 이용하세요.");
        } else if (distace <= 10) {
            System.out.println("distance: " + distace);
            System.out.println("출력 : 자전거를 이용하세요.");
        } else if (distace <= 100) {
            System.out.println("distance: " + distace);
            System.out.println("출력 : 자동차를 이용하세요.");
        } else {
            System.out.println("distance: " + distace);
            System.out.println("출력 : 비행기를 이용하세요.");
        }
    }
}
