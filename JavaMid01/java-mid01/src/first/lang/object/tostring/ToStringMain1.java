package first.lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();
        int a = 3000;
        System.out.println(string);
        System.out.println(object);
        System.out.println("=======");
        System.out.println(object.getClass());
        System.out.println(123);

    }
}
