package second.lang.immutable;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);
        //return 타입이 ImmutableObj이기 때문에 변경된 결과를 새로운 객체에 담아 return
        //따라석 꼭 반환값을 받아주는 새로운 참족변수를 만들어줘야한다.

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());

    }
}
