package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex0.DiscountService discountService = new DiscountService();//Discount Service 객체 생성

        int basic = discountService.discount(StringGrade.BASIC, price);// 등급별 할인율 변수에 할당
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOlD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
