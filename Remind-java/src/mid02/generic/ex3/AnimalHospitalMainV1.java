package mid02.generic.ex3;

import mid02.generic.animal.Cat;
import mid02.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //problem_01 개 병원에 고양이를 전다랗ㅁ
        dogHospital.set(cat);
        //타입 안정성 부족 -> 매개변수 체크를 실패함 -> Animal 타입을 받기 때문에 컴파일 오류가 X

        //problem_02 Animal type을 return하기 때문에 위험하고 귀찮은 downcasting이 필요함
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("수동이", 10000));
        System.out.println(biggerDog);


    }
}
