package mid02.collection.map.test.cart;

import java.util.*;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product , int amount) {
        if (cartMap==null) {
            cartMap.put(product, amount);
        } else {
            int newAmount = cartMap.get(product) + amount;
            cartMap.put(product, newAmount);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cartMap, cart.cartMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cartMap);
    }


    public void printAll() {
        System.out.println("==모든 상품 출력==");
        Set<Product> products = cartMap.keySet();
        for (Product product : products) {
            System.out.println("상품: Product{name='"+product.getName()+"', price="+product.getPrice()+"}"+ " 수량: "+cartMap.get(product));
        }

    }
}
