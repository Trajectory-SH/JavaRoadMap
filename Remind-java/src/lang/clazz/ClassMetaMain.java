package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class 조회
        Class clazz1 = String.class;//Class로부터 직접 조회
        System.out.println(clazz1);
        Class clazz2 = new String().getClass();//해당 클래스의 인스턴스로부터의 조회
        System.out.println(clazz2);
        Class clazz3 = Class.forName("java.lang.String");//Class의 static method를 통해서 접근
        System.out.println(clazz3);

        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + "       " + field.getName());
        }

        System.out.println("superclass: "+clazz1.getSuperclass());

    }
}
