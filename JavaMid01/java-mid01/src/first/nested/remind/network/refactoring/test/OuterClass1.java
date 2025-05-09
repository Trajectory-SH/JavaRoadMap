package first.nested.remind.network.refactoring.test;

public class OuterClass1 {

    public static class NestedClass {

        public static void hello() {
            System.out.println("정적 중첩 클래스의 Hello");
            System.out.println("외부 파일에서 접근을 해야하기 때문에 public으로 선언했습니다.");
        }

        public void nonStaticHello() {
            System.out.println("정적 중첩 클래스의 Hello(non-static)");
            System.out.println("외부 파일에서 접근을 해야하기 때문에 public으로 선언했습니다.");
        }


        private void priHello() {
            System.out.println("정적 중첩 클래스의 Hello");
            System.out.println("외부 파일에서 접근을 못합니다.");
        }
    }
}
