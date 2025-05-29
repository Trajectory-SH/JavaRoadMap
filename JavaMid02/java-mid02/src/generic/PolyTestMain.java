package generic;

public class PolyTestMain {
    public static void main(String[] args) {
        AnimalTest animal = new AnimalTest();
        AnimalTest thisIsDog = new DogTest("강아지");
        AnimalTest thisISCat = new CatTest("고양이");

        animal.animalMethod();
        animal.sound();

        System.out.println("===강아지 테스트===");
        thisIsDog.sound();//오버라이딩이 되어있는 메서드가 호출된다.
        if (thisIsDog instanceof DogTest dog) {
            dog.dogMethod();
        }
    }
}
