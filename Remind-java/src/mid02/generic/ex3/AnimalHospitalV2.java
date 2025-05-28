package mid02.generic.ex3;

public class AnimalHospitalV2<T> {
    //T type의 animal -> animal은 참조변수이며 T type의 객체를 참조한다.
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        //Animal 클래스에 있는 필드, 메서드들에 접근하지 못한다. 아직 T타입이 정의되어 있지 않음
        // Object의 재미없는 기능들만 이용이 가능하다.
        animal.toString();
        animal.equals(null);


//        자바의 입장에서는 T의 animal이 무슨 클래스인지 알 길이 없다.
//        System.out.println("동물이름: " + animal.getName());
//        animal.sound();
    }

    public T getBigger(T target) {
//        return animal.getSize();
        //마찬가지로 Animal 클래스의 멤버 함수 .getSize()에 접근이 불가능하다 아직 T에 대한 정보 X
        return null;
    }

   /* 자바 컴파일러는 어떤 타입이 들어오는지 알 수 없기 떄문에
      T를 어떤 타입이든지 받을 수 있는 Object 타입으로 가정한다.
      따라서 Object가 제공하는 메서드들만 사용이 가능하다.


      => 최소한으로 Animal이나 그 자식타입을 인자로 제한할 수 있는 방법이 있는가.
   */
}
