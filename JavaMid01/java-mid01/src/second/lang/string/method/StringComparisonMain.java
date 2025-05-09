package second.lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello Java!";//대문자 존재
        String str2 = "hello java!";//소문자로 구성
        String str3 = "hello World!";//소문자로 구성

        System.out.println("str1 equals() str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equals(str2));
        System.out.println();

    }
}
