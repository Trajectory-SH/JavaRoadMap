package remind01.poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void fly() {
        System.out.println("푸드덕");
    }

    @Override
    public void sound() {
        System.out.println("구구");
    }
}
