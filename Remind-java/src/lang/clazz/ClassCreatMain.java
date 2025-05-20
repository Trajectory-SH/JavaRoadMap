package lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreatMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class helloClass = Class.forName("lang.clazz.Hello");
        System.out.println(helloClass);

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
