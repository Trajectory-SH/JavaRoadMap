package remind01.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {

        Parent poly = new Child();
        Child child = (Child) poly;//downCasting
        child.childMethod();

//        Parent poly2 = new Parent();
//        Child child2 = (Child) poly2;
//        child2.childMethod();

    }
}
