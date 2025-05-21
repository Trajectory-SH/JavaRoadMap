package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {//회원 등급과 가격을 받음
        int discountPercent = 0; //메서드안에서 생명주기가 끝나는 local variable

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " 고객님은 할인 대상이 아닙니다.");
            //discountPercent가 0이기 때문에 어차피 할인율 0이 return이 된다.
        }
        return price * discountPercent / 100;
    }
}
