package mid02.generic.ex4;

import mid02.generic.animal.Cat;
import mid02.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("수동이", 100);
        Cat cat = new Cat("고영이", 10);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog1 = new Dog("큰 개", 3000);
        Dog bigger = AnimalMethod.getBigger(dog, dog1);
        System.out.println("bigger = " + bigger);
    }
}
