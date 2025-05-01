package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] order = new ProductOrder[3];

        //creatOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장함
        order[0]=createOrder("두부",2000,2);
        order[1]=createOrder("김치",5000,1);
        order[2]=createOrder("콜라",1500,2);

        //printOrders()를 사용해서 상품 주문 정보를 출력
        printOrders(order);

        //getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(order);

        //총 결제 금액 출력
        System.out.println("총 결제 금액: "+totalAmount);
    }

    //default 접근제어자.
    static  ProductOrder createOrder(String productName,int price, int quantity){
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity=quantity;

        return product;

    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder item : orders) {
            System.out.println("상품명: "+item.productName+", 가격: "+item.price+", 수량: "+item.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder item : orders) {
            totalAmount += item.price * item.quantity;
        }
        return totalAmount;
    }
}
