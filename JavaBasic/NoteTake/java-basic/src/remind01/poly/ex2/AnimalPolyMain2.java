package remind01.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animalArr = {dog, cat, caw};//Animal 참조값을 갖고 있는 참조 변수들을 가질 수 있음
        animalSound(animalArr);
    }

    private static void animalSound(Animal[] animalArr) {
        for (Animal a : animalArr) {
            System.out.println("동물소리 테스트----");
            a.sound();
            System.out.println("동물소리 테스트 종료");
        }
    }
}
