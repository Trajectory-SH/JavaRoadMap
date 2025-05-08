package first.nested.inner.ex1;

//Class Engine은 Car 클래스 내부에서만 사용된다 -> 굳이 나누지 말고 합치는 게 좋겠는데?
public class Engine {
    private Car car;

    public Engine(Car para) {
        this.car = para;
    }

    public void start() {
        System.out.println("충전량 확인: "+car.getChargeLevel());
        System.out.println(car.getModel()+"의 엔진을 구동합니다.");
    }
}
