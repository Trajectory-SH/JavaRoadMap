package first.nested.remind.network.refactoring.test;

public class OuterClass1Main {
    public static void main(String[] args) {

        OuterClass1.NestedClass stat = new OuterClass1.NestedClass();
        OuterClass1.NestedClass.hello();
        stat.nonStaticHello();
        //stat.priHello();
    }




}
