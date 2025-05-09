package first.nested.remind.network.refactoring.innerclass;

public class CarStatic {
    //인스턴스 멤버 변수(캡슐화를 위해서 private로 선언하는 것이 default이다.
    private String model;
    private int chargeLevel;

    //생성자(한 대의 차 객체를 생성한다 -> 모델, 충전량, 그 차 안에 들어가는 엔진을 구성요소로 갖는다)
    public CarStatic(int chargeLevel, String model) {
        this.chargeLevel = chargeLevel;
        this.model = model;
    }

    //인스턴스 멤버 함수 : public으로 선언해서 외부에 필요한 기능을 제공한다.
    public void start(String car,int percentage) {
        Engine engineCar = new Engine(percentage,car);
        engineCar.start();

        System.out.println(model+"출발합니다.");
    }

    //정적 중첩 클래스는 인스턴스 멤버변수에 접근이 불가능하다.(외부 클래스와 독립적으로 존재한다.)
    private static class Engine {
        private int chargeLevel;
        private String model;

        public Engine(int chargeLevel, String model) {
            this.chargeLevel = chargeLevel;
            this.model = model;
        }

        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model+"의 엔진을 구동합니다.");
        }
    }
}
