package second.lang.immutable;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;//참조값 대입을 막을 수는 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        b = new ImmutableAddress("부산");
        System.out.println("======final value값 변경======");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
