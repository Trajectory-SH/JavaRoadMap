package first.array.ex;

import java.util.Scanner;

public class ProductAdminExTry02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean stopFlag = false;
        int choice;
        String[] productNames = new String[3];
        int[] productPrices = new int[3];
        int productCount = 0;


        while (!stopFlag) {
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    if (productCount == 3) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scan.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = Integer.parseInt(scan.nextLine());
                    productCount++;
                    break;
                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    break;
                case 3:
                    stopFlag = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 값을 입력했습니다. 올바른 값을 다시 입력해주세요..");
                    break;
            }


        }


    }
}
