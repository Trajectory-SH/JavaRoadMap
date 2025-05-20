package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String key = "hello";
        String string = "start hello, hello java, hello jpa";

        int count = 0;
        int index = string.indexOf(key+20);//최초의 index만 return한다.
        System.out.println(index);

        while (index >= 0) {
            index = string.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count= " + count);
    }
}

