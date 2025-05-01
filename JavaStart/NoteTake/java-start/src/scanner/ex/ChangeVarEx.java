package scanner.ex;

public class ChangeVarEx {//변수값을 교환하는 것
    public static void main(String[] args) {
        //temp를 사용하되 variable의 scope를 고려하여 code를 작성한다.
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
