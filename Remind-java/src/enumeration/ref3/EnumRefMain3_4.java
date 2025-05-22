package enumeration.ref3;

public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
        System.out.println(Grade.BASIC.name());

    }


    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인금액은..." + grade.discount(price));
    }
}

/*
* enum type의 유용한 메서드
* enumClass.values(); -> 문자열 타입의 배열로 return(클래스 이름으로 접근하는 것 보니 static method)
* enumInstance.name(); -> 객체 참조를 통한 접근 해당 상수값을 return
* */
