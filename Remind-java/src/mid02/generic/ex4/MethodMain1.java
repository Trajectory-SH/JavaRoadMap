package mid02.generic.ex4;

import mid02.generic.animal.Dog;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달하기");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        String integerValue = GenericMethod.genericMethod("String");
        Double doubleValue = GenericMethod.numberMethod(3123.12);
    }
}
