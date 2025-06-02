package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> cart;

    public ShoppingCart(List<Item> cart) {
        this.cart = cart;
    }

    public void addItem(Item item) {
        cart.add(item);
    }
    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < cart.size(); i++) {
            Item product = cart.get(i);
            total += product.getTotalPrice();
            System.out.println("상품명: " + product.getName() + ", 합계: " + product.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + total);
    }


}
