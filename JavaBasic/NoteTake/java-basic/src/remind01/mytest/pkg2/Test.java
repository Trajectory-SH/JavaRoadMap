package remind01.mytest.pkg2;

import remind01.mytest.pkg1.Child;
import remind01.mytest.pkg1.Parent;

public class Test {

    public static void main(String[] args) {
        Parent p = new Child();
        p.hello();
    }
}
