package first.nested.remind.network.refactoring.test;

public class AnonymousMain {
    public static void main(String[] args) {

        Hello start = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        start.hello();

    }
}
