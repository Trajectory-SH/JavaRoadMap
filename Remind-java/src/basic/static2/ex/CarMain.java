package basic.static2.ex;



public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("차1");
        Car car2 = new Car("차2");
        Car car3 = new Car("차3");

        Car.showTotalCars();
    }
}
