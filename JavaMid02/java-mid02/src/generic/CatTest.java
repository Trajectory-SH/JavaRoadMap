package generic;

public class CatTest extends AnimalTest {

    public String catName;

    public CatTest(String catName) {
        this.catName = catName;
    }


    @Override
    public void sound() {
        System.out.println("고양이 울음 소리");
    }


    public void catMethod() {
        System.out.println("This is unique Cat Method");
    }
}
