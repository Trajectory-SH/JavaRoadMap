package second.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;


        boolean stopFlag = false;
        while (!stopFlag) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int inputNum = Integer.parseInt(scanner.nextLine());

            switch (inputNum) {
                case 1:
                    if (productCount < 10) {
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = scanner.nextLine();
                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = Integer.parseInt(scanner.nextLine());
                    } else {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    }
                    productCount++;
                    break;//switch문에서의 break는 switch문만 탈출한다.

                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    } else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(productNames[i] + ": " + productPrices[i]);
                        }
                    }
                    break;

                case 3:
                    stopFlag = true;
                    System.out.println("프로그램이 종료됩니다.");

            }

        }


    }
}
