package remind02.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[3];
    private int productCount;


    public void addItem(Item item) {
        if (productCount < items.length) {
            System.out.println("===========================");
            System.out.println(productCount+"번째로 장바구니에 물건을 추가합니다.");
            System.out.println("제품명 :"+item.getProductName()+"가격: "+item.getPrice()+"수량: "+item.getQuantity());
            items[productCount] = item;
            productCount++;
            System.out.println("===========================");
        }else {
            System.out.println("장바구니에 물건이 가득찼습니다.");
            System.out.println("===========================");

        }
    }
    private int totalAmount() {
        int totalAmount = 0;
        for (Item s : items) {
            if(s==null) continue;
            totalAmount += s.getPrice()*s.getQuantity();
        }
        return totalAmount;
    }

    public void displayItems() {
        System.out.println("전체가격 합: "+totalAmount());
    }
}
