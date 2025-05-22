package enumeration.ref3;

public enum Grade {
    BASIC(10),GOLD(20), DIAMOND(30);
    private final int discountPercentage;

    Grade(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public int discount(int price) {//캡슐화를 통해 필요한 기능만 외부에 제공한다.
        return price * discountPercentage / 100;
    }
}
