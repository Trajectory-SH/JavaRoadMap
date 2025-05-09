package first.nested.remind.network.refactoring.innerclass;

public class Car {
    //인스턴스 멤버 변수(캡슐화를 위해서 private로 선언하는 것이 default이다.
    private String model;
    private int chargeLevel;
    private Engine engine;

    //생성자(한 대의 차 객체를 생성한다 -> 모델, 충전량, 그 차 안에 들어가는 엔진을 구성요소로 갖는다)
    public Car(int chargeLevel, String model) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine();
    }

    //인스턴스 멤버 함수 : public으로 선언해서 외부에 필요한 기능을 제공한다.
    public void start() {
        engine.start();
        System.out.println(model+"출발합니다.");
    }


    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model+"의 엔진을 구동합니다.");
        }
    }
}
