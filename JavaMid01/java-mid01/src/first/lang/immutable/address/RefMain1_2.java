package first.lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address address1 = new Address("서울");
        Address address2 = new Address("서울");
        System.out.println("a  =" + address1);
        System.out.println("b  =" + address2);

        address2.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a  =" + address1);
        System.out.println("b  =" + address2);
    }
}
