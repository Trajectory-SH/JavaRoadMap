package remind01.poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //AbstractAnimal animal = new AbstractAnimal();
        //'AbstractAnimal' is abstract; cannot be instantiated
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        caw.sound();//그냥 본인의 메서드 호출
        caw.move();//추상클래스로부터 상속받은 메서드

        soundAnimal(dog); // 오버라이딩된 메서드 호출
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
