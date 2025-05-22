package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();//모든 ENUM을 return 배열로 받을 수 있다.


        System.out.println("values = " + values);//그냥 values를 toString하면 참조값이 return
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));//Arrays 클래스에 존재하는 toString() 메서드 사용
        for (Grade value : values) {
            System.out.println("value.name()+\", ordinal = \" = " + value.name()+", ordinal = "+ value.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);

        int output = Grade.BASIC.ordinal();
        System.out.println("output = " + output);
        String  output1 = Grade.BASIC.toString();
        System.out.println("output1 = " + output1);
    }
}
