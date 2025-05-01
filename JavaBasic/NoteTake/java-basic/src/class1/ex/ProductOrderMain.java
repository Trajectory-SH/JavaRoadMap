package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productList = new ProductOrder[3];
        ProductOrder product1 =new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        productList[0] = product1;

        ProductOrder product2 =new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        productList[1] = product2;

        ProductOrder product3 =new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        productList[2] = product3;

        for (ProductOrder p : productList) {
            System.out.println("상품명: "+p.productName+", 가격: "+p.price+", 수량: "+p.quantity);
        }
        int totalSales = 0;
        for (ProductOrder p : productList) {
            int sales = salesAmount(p);
            totalSales += sales;
        }
        System.out.println("총 결제 금액: "+totalSales);




    }
    public static int salesAmount(ProductOrder product){
        int salesAmount = product.price * product.quantity;
        return salesAmount;
    }
}
