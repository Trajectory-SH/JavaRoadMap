package remind01.poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    private static void soundAnimal(Animal anyAnimal) {
        System.out.println("동물 울음소리 테스트 시작");
        anyAnimal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }

}
