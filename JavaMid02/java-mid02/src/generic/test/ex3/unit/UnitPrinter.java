package generic.test.ex3.unit;

public class UnitPrinter {


    public static <T> void printV1(Shuttle<T> a) {
        a.showInfo();

    }

    public static void printV2(Shuttle<?> shuttle1) {
        shuttle1.showInfo();
    }
}
