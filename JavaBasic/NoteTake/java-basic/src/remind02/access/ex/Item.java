package remind02.access.ex;

public class Item {
    private String productName;
    private int price;
    private int quantity;

    public Item(String productName, int price, int quantity) {
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
