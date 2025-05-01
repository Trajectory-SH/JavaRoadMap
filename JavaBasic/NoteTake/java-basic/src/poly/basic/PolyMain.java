package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("P -> P");
        Parent parent = new Parent();

        System.out.println("C -> C");
        Child child = new Child();
        child.patentMethod();
        child.childMethod();

        //부모 변수가 자식의 인스턴스 참조(다형성
        System.out.println();
        System.out.println("P->C");
        Parent poly = new Child();
        poly.patentMethod();
    }
}
