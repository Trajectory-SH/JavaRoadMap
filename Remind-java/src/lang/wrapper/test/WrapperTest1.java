package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.valueOf(str1);
        int d = Integer.valueOf(str2);


        System.out.println("두 수의 합: "+ (a + b));
        System.out.println("두 수의 합: "+ (c + d));
    }
}
