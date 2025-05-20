package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        //.split(<regularExpression>)은 string array를 return한다.
        String[] parts = new String[2];
        parts = email.split("@");
//        System.out.println(parts[0]);
//        System.out.println(parts[1]);

        System.out.println("ID: " + parts[0]);
        System.out.println("Domain: " + parts[1]);

    }

}
