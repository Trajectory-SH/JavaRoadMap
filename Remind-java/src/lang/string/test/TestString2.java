package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int totalLength = 0;

        for (String a : arr) {
            System.out.println(a + " = "+ a.length());
            totalLength += a.length();
        }
        System.out.println("totalLength = " + totalLength);
    }
}
