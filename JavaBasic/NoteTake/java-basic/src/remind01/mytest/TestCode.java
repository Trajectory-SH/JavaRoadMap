package remind01.mytest;

import java.util.Scanner;

public class TestCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("값을 입력해주세요>");
        String str = scan.nextLine();
        if(str =="abc"){
            System.out.println("참입니다.");
        }
        else {
            System.out.println("거짓입니다");
        }
    }
}