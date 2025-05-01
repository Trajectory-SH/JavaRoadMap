package remind02.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] productOrders = {tofu, kimchi, coke};
        int totalPrice = 0;
        for (ProductOrder a : productOrders) {
            System.out.println("상품명: " + a.productName + ", 가격: " + a.price + ", 수량: " + a.quantity);
            totalPrice += a.price * a.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);

        System.out.println("======Array Test======");
        String[] members = new String[4];
        System.out.println(members[1]);




    }
}
