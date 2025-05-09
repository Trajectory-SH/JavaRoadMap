package second.lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("문자열 길이: " + str.length());
        System.out.println("문자열이 비어있는가: " + str.isEmpty());
        System.out.println("문자열이 비어있는지 or 공백인지: " + str.isBlank());
        System.out.println("8번 인덱스의 문자: "+ str.charAt(8));
    }
}
