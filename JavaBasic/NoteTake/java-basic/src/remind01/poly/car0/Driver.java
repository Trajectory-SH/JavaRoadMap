package remind01.poly.car0;

public class Driver {
    private K3Car k3Car;//private 멤버변수...K3Car type의 인스턴스 참조변수 k3car

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        k3Car.startEngine();
        k3Car.pressAccelerator();
        k3Car.offEngine();
    }


}
