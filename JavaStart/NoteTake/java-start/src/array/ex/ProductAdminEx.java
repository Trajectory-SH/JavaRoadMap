package array.ex;

import java.util.Scanner;

public class ProductAdminEx {//상품 관리 프로그램 만들기

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxProduct = 2;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        while (true) {

            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");

            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    if (productCount == maxProduct) {
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
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 입력해주세요.");
                    break;


            }

        }

    }
}
