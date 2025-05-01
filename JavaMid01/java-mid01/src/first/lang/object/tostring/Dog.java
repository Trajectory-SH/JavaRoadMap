package first.lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    public Dog(int age, String dogName) {
        this.age = age;
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return "Dog{" +
               "age=" + age +
               ", dogName='" + dogName + '\'' +
               '}';
    }
}
