package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj obj2 = immutableObj.add(20);

        System.out.println("immutableObj = " + immutableObj.getValue());
        System.out.println("obj2 = " + obj2.getValue());


    }
}
