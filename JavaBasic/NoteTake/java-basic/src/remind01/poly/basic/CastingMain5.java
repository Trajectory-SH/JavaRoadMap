package remind01.poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1을 호출");
        call(parent1);
        System.out.println("===================");
        Parent parent2 = new Child();
        System.out.println("parent2을 호출");
        call(parent2);

    }

    private static void call(Parent parentAddressVariable) {
        parentAddressVariable.parentMethod();
        System.out.println("======================");
        if (parentAddressVariable instanceof Child) {
            System.out.print("Case1: ");
            System.out.println("이 Parent 참조변수는 Child 인스턴스를 갖고 있습니다. downCasting 실행!");
            ((Child)parentAddressVariable).childMethod();//이러면 하위 타입의 childMethod를 사용 가능하다.
        }
        else {
            System.out.print("Case2: ");
            System.out.println("이 Parent 참조변수는 Child 인스턴스를 갖고 있지 않아서 downCasting이 불가능합니다.");
        }
    }
}
