package first.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();//당연히 클래스이기 때문에 인스턴스 생성

        //인스턴스 생성후 인스턴스 참조를 통해 메서드에 접근
        nested.print();

        System.out.println("nestedClass: " + nested.getClass());

    }
}
