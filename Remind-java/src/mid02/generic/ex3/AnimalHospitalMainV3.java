package mid02.generic.ex3;

import mid02.generic.animal.Animal;
import mid02.generic.animal.Cat;
import mid02.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("수동이", 100);
        Cat cat = new Cat("호야", 5300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //problem_01 해결 -> 타입 안전성을 보장해줄 수 있다.
        //dogHospital.set(cat); -> 입력 타입이 보장되어 있기에 다른 타입이 입력되면 컴파일 오류


        //problem_02 해결 <T>에서 Dog로 지정되었기 때문에 return 타입이 명확하게 Dog 제한됨
        Dog bigger = dogHospital.getBigger(new Dog("멍", 200));
        System.out.println("bigger = " + bigger);
    }
}
