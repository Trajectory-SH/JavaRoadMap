package start.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopFlag = false;
        String[] productName = new String[2];
        int[] productPrice = new int[2];
        int productCount = 0;
        while (!stopFlag) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int inputNum = Integer.parseInt(scanner.nextLine());
            switch (inputNum) {
                case 1:
                    if(productCount <2){
                        System.out.print("상품 이름을 입력하세요: ");
                        productName[productCount] = scanner.nextLine();
                        System.out.print("상품 가격을 입력하세요: ");
                        productPrice[productCount] = Integer.parseInt(scanner.nextLine());
                        productCount++;
                    }else {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    }
                    break;

                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    }else {
                    for (int i = 0;i<productCount; i++) {

                        System.out.println(productName[i] + " : " + productPrice[i] + "원");

                    }

                    }
                    break;
                case 3:
                    stopFlag = true;
                    break;

                default:
                    System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
