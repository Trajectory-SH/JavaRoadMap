package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(3, message);
        System.out.println("==========");
        printMessage(5, message);
        System.out.println("==========");
        printMessage(7, message);
        System.out.println("==========");

    }

    public static void printMessage(int iterNum, String message) {
        for (int i = 0; i < iterNum; i++) {
            System.out.println(message);
        }
    }
}
