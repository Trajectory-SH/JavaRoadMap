package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String text1 = "hello.txt";
        String text2 = ".txt";

        String fileName = text1.substring(0,text1.indexOf(text2));
        String extName = text1.substring(text1.indexOf(text2));
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
