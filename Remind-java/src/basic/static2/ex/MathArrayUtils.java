package basic.static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int sumValues = 0;
        for (int value : values) {
            sumValues += value;
        }
        return sumValues;
    }

    public static double average(int[] values) {
        return (double) MathArrayUtils.sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value>  maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}
