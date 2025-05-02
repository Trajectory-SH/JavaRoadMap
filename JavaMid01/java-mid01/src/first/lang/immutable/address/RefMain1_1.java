package first.lang.immutable.address;

import java.net.Socket;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("안녕");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println(new StringBuilder()
                .append("a= ")
                .append(a)
                .toString());
        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}
