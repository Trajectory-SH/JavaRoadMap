package first.nested.local;

public class LocalOuterV3_02 {
    private int outInstanceVar = 3;

    public Printer method(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        Printer print = new LocalPrinter();
        return print;
        //Printer 참조 변수 return..!
    }


    public static void main(String[] args) {
        LocalOuterV3_02 outer = new LocalOuterV3_02();
        Printer printer = outer.method(1000);

        printer.print();
    }
}
