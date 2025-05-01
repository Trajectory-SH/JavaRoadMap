package remind02.pack.com.helloshop.order;

import remind02.pack.com.helloshop.product.Product;
import remind02.pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;


    public Order(User user, Product product ) {
        this.user = user;
        this.product = product;
    }
}
