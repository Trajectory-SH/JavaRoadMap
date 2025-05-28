package mid02.generic.ex2;

import mid02.generic.animal.Animal;
import mid02.generic.animal.Cat;
import mid02.generic.animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("수동", 100);
        Cat cat = new Cat("고양", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

    }
}
