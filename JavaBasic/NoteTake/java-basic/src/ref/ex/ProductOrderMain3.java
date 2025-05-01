package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = Integer.parseInt(scan.nextLine());

        ProductOrder[] order = new ProductOrder[orderCount];

        //ㅁ
        for (int i = 0; i < orderCount; i++) {
            System.out.println("============================");
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            order[i] = new ProductOrder();
            System.out.print("상품명: ");
            order[i].productName = scan.nextLine();
            System.out.print("가격: ");
            order[i].price = Integer.parseInt(scan.nextLine());
            System.out.print("수량: ");
            order[i].quantity = Integer.parseInt(scan.nextLine());
        }

        System.out.println("============================");
        printOrders(order);
        int totalAmount = getTotalAmount(order);
        System.out.println("총 결제 금액: " + totalAmount);


    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder item : orders) {
            System.out.println("상품명: " + item.productName + ", 가격: " + item.price + ", 수량: " + item.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder item : orders) {
            totalAmount += item.price * item.quantity;
        }
        return totalAmount;
    }
}
