package second.method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = getSum(a, b, c);
        double avg = getAverage(sum, 3);
        System.out.println("AVG1rr: " + avg);

        int x = 15;
        int y = 25;
        int z = 35;
        sum = getSum(x, y, z);
        avg = getAverage(sum, 3);
        System.out.println("AVG2: " + avg);


    }

    private static double getAverage(int sum, int divNum) {
        return (double) sum / divNum;
    }

    private static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
