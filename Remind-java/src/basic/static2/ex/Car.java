package basic.static2.ex;

import java.util.ArrayList;

public class Car {
    private static int totalCar;
    //초기화를 해주지 않으면 nullPointer Exception이 발생한다.
    private static ArrayList<Car> myCar = new ArrayList<>();
    private String name;

    public Car(String car) {
        name = car;
        myCar.add(this);
        totalCar++;
    }

    public static void showTotalCars() {
        for (int i = 0; i < myCar.size(); i++) {
            System.out.println("차량 구입, 이름: " + myCar.get(i));
        }
        System.out.println("구매한 차량 수 : " + totalCar);
    }

    @Override
    public String toString() {
        return name;
    }
}
