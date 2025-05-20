package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //기본형 -> 객체(Boxing)
        int value = 7;
        Integer boxValue = Integer.valueOf(value);

        //객체 -> 기본형(Unboxing)
        int unboxValue = boxValue.intValue();

        System.out.println("boxValue = " + boxValue);
        System.out.println("unboxValue = " + unboxValue);
    }
}
