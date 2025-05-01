package remind01.extends1.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다");
    }


    @Override
    public void move() {
        System.out.print("Car class의 move() = ");
        super.move();
        System.out.print("ElectricCar class의 move()");



    }
}
