package remind01.poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("=======================");
        System.out.println("자동차 설정을 시작합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("===============");
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
