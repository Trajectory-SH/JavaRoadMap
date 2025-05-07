package second.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {

        System.out.println("===");
        PrintMessage(3);
        System.out.println("===");
        PrintMessage(4);
        System.out.println("===");
        PrintMessage(5);
    }

    private static void PrintMessage(int iterNum) {
        for (int i = 0; i < iterNum; i++) {
            System.out.println("Hello, world!");
        }
    }
}
