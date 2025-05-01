package remind01.poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼭");
    }

    @Override
    public void fly() {
        System.out.println("푸드드덕덕");

    }
}
