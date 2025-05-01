package remind01.extends1.access.child;

import remind01.extends1.access.parent.Parent;

public class Child extends Parent {

    public static void main(String[] args) {
        Child a = new Child();
        a.call();
    }
    public void call() {
        publicValue=1;
        protectedValue=1;

        System.out.println("public, protected 메서드는 호출이 가능하다.");
        publicMethod();
        protectedMethod();

        System.out.println("======Parent Class 내부 메서드=======");
        printParent();
//        printParent(); 는 public이기 때문에 import하고 상속을 해준다면 외부 패키지에서도 접근해서 사용 가능하다.
    }


}
