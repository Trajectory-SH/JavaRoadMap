package enumeration.ref2;

public enum Grade {
    BASIC(10),GOLD(20), DIAMOND(30);
    private final int discountPercentage;

    Grade(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
