package first.nested.remind.network.refactoring.test;

public class OuterClass3 {


    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("helloWorld");
            }
        }

        LocalClass local = new LocalClass();
        local.hello();

    }

}
