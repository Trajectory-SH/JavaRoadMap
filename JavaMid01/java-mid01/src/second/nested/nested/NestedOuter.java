package second.nested.nested;

public class NestedOuter {
    private static String outClassVal = "외부 클래스의 정적 변수";
    private String outInstanceVal = "외부 클래스의 인스턴스 변수";

    static class Nested{
        private static String nestedClassVal = "내부 클래스의 정적 변수";
        private String nestedInstanceVal = "내부 클래스의 인스턴스 변수";


        private void print() {
            System.out.println(outClassVal);
            System.out.println(nestedInstanceVal);
            System.out.println(Nested.nestedClassVal);

        }
    }

}
