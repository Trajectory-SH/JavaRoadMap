package first.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean stopFlag = false;

        int totalPrice = 0;

        while (!stopFlag) {

            System.out.println("====Menu====");
            System.out.println("1: 상품입력");
            System.out.println("2: 결제");
            System.out.println("3: 프로그램 종료");
            System.out.println("============");


            System.out.print("메뉴번호를 입력해주세요>> ");
            String option = scan.nextLine();


            switch (option) {
                case "1":
                    System.out.print("상품명을 입력하세요: ");
                    String name = scan.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = Integer.parseInt(scan.nextLine());
                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = Integer.parseInt(scan.nextLine());
                    totalPrice += price * quantity;
                    System.out.printf("상품명: %s 가격: %d 수량: %d 합계: %d\n", name, price, quantity, totalPrice);
                    break;
                case "2":

                    System.out.println("총 비용: " + totalPrice);
                    totalPrice = 0;
                    break;
                case "3":
                    stopFlag = true;
                    System.out.println("====프로그램을 종료합니다====");
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
                    break;


            }


        }


    }
}
