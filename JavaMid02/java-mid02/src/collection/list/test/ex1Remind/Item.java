package collection.list.test.ex1Remind;

public class Item {

    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int
            quantity) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
