package remind01.poly.ex3;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {//상속 받는 추상 클래스에서 추상 메서드를 무조건 overriding 해줘야한다.
        System.out.println("멍멍");
    }
}
