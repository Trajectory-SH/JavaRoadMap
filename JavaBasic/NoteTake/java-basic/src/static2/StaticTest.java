package static2;

public class StaticTest {

    int classValue;

    public static void main(String[] args) {
        StaticTest test = new StaticTest();

        System.out.println("정적 메서드 안에서 쓸 수 있는데~ 있는데 ~  ");
        test.thisIsInstanceMethod();
        //이때 인스턴스로 접근을 했다가 어라...
    }
    void thisIsInstanceMethod(){
        System.out.println("인스턴스 메서드입니다.");
        /*
        이거슨 staticTest Class의 인스턴스 메서드입니다..
        즉 staticTest의 인스턴스가 만들어져야지 인스턴스 참조값으로 접근을 할 수 있는거랍니다.
        그러면 이 클래스의 정적 메서드안에서 인스턴스 메서드를 사용하기 위해서는 해당 클래스의 객체를 통해서 접근
        따라서 StaticTest의 객체를 만들어서 접근을 해보는 시간을 가져볼까요?
        staticTest Class


         */
    }
}
