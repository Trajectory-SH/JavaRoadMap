package first.nested.remind.network.refactoring.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 addressNum = new OuterClass2();

        //내부클래스는 인스턴스 취급을 당하기 때문에 무조건 객체 참조를 통해서 생성자에도 접근할 수 있다.
        //내부 클래스의 객체를 생성하는 과정에서 OuterClass의 참조 정보를 자바 내부에서 자동으로 넘겨받음 this $0
        OuterClass2.InnerClass innerInstance = addressNum.new InnerClass();
        System.out.println("============");
        innerInstance.hello();
        System.out.println("============");

    }
}
