package first.nested.nested;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();//외부 클래스의 참조를 통해서 접근 해야한다.
        inner.print();
        System.out.println("inner Class" + inner.getClass());
    }
}
