package first.nested.remind.network.refactoring.anonymous;

import java.util.Random;

public class Anonymous_02 {
    //같은 클래스에 있기 때문에 클래스 이름으로 접근하지 않아도 된다.
    public static void hello(Processs process) {
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }

    //인스턴스가 없어도 실행이 가능한 정적 함수
    public static void main(String[] args) {
        //함수 안에 있으니 Local Variable이라고 생각해도 무방_01
        //Process에 대한 참조값을 생성하고 바로 구현부를 작성한다.
//한 번만 사용하고 버리기 때문에 클래스 이름은 필요가 없음
        Processs dice = () -> {
            int ranVal = new Random().nextInt(6) + 1;
            System.out.println("주사위= " + ranVal);
        };
        //함수 안에 있으니 Local Variable이라고 생각해도 무방_02
        Processs sum = new Processs() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);


         /*
         * 지역클래스를 사용하는 것은 사실 드물다.
         * 정말로 복잡한 로직을 사용하는 것이 아니라면 대부분 어느 기능을 수행하는 코드조각을
         * 넘겨줄 가능성이 높다
         * 이 경우에는 대부분 익명클래스나 람다식으로 처리하는 것이 좋다.
         * */



    }

}
