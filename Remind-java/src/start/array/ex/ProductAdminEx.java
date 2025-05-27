package start.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[2];
        int[] productPrices = new int[2];

        int productCount = 0;

        while (true) {
            System.out.println("1. 상품등록  | 2. 상품 목록  | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menuNum = scanner.nextInt();
            scanner.nextLine();

            switch (menuNum) {
                case 1:
                    if (productCount< productNames.length){
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = scanner.nextLine();
                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = scanner.nextInt();

                        productCount++;
                    }else {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    }

                    break;

                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    }else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(productNames[i] + " : " + productPrices[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");

            }
        }
    }
}
