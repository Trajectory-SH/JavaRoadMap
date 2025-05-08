package first.nested.anonymous.ex;

public class Ex0RefMain {
    static void hello(String string) {
        System.out.println("시작");
        System.out.println(string);
        System.out.println("종료");
    }

    public static void main(String[] args) {
        hello("자바");
        hello("스프링");
    }

}
