package loop.ex;

import java.util.Scanner;

public class NestedEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("행을 입력해주세요: ");
        int row = scan.nextInt();

        for(int i = 0;i<row;i++){
            for (int x=0;x<i+1;x++){
            System.out.print("*");
           }
            System.out.println();
        }
        System.out.println("===별찍기 프로그램을 종료합니다===");
    }
}
