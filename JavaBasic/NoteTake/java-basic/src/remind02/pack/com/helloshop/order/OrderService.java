package remind02.pack.com.helloshop.order;

import remind02.pack.com.helloshop.product.Product;
import remind02.pack.com.helloshop.user.User;

public class OrderService {

    public void Order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user,product);
    }
}
