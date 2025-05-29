package generic;

public class DogTest extends AnimalTest {

    public String dogName;

    public DogTest(String dogName) {
        this.dogName = dogName;
    }


    @Override
    public void sound() {
        System.out.println("강아지 울음 소리");
    }


    public void dogMethod() {
        System.out.println("This is unique Dog Method");
    }
}
