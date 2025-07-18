package second.lang.immutable;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("=========값 변환 후==========");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
