package first.lang.clazz;

import second.lang.object.equals.UserV2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class;// 클래스에서 조회
// Class clazz1 = new String().getClass();
//        Class claaz2 = Class.forName("java.lang.String");
        
        
        //Class 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        System.out.println("============");

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래서 정보
        System.out.println("SupperClass = " + clazz.getSuperclass().getName());
        
        //인터페이스 정보
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }
    }

}
