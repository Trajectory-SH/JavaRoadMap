package remind01.extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super();//Class B 객체가 생성되었을 때 실제로 A, B 인스턴스가 모두 생성되기 위해서는 자식단에서 부모 생성자를 호출해줘야한다.
        System.out.println("ClassB 생성자 a ="+a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a = " + a + "b= " + b);
    }
}
