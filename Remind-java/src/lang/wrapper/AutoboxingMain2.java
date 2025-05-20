package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value;//Autoboxing

        int unboxedValue = boxedValue;//Auto unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
