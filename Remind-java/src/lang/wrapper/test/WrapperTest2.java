package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double totalSum = 0;
        for (String content : array) {
            totalSum += Double.parseDouble(content);
        }
        System.out.println("sum = " + totalSum);
    }
}
