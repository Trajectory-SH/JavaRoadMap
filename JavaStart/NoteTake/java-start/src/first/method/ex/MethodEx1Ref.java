package first.method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        double sum = add(a, b, c);
        double average = avg(sum);
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;

        sum = add(x, y, z);
        average = avg(sum);
        System.out.println("평균값: " + average);

    }

    public static double add(int a, int b, int c) {
        int sum = a + b + c;
        return (double) sum;
    }

    public static double avg(double sum) {
        return sum / 3.0;
    }


}
