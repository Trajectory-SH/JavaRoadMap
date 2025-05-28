package mid02.generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object object) {
        System.out.println("object print : " + object);
        return object;
    }

    //<T>는 제너릭 메서드를 선언하는 키워드
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print : " + t);
        return t;
    }



}
