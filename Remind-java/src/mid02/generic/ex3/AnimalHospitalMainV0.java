package mid02.generic.ex3;

import mid02.generic.animal.Cat;
import mid02.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("수동", 100);
        Cat cat = new Cat("고양이", 50);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        Dog isBiggerDog = dogHospital.bigger(new Dog("강어지", 200));
        System.out.println("isBiggerDog = " + isBiggerDog);

    }
}
