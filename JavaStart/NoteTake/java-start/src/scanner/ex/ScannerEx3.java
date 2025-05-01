package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("음식의 이름을 입력해주세요: ");
        String foodName = scan.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = scan.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = scan.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.printf("%s %d개를 주문하셨습니다. 총 가격은 %d원입니다",foodName,foodQuantity,totalPrice);

    }
}
