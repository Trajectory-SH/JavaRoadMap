package generic.test.ex3.unit;

public class Shuttle<T> {
    public T unit;


    public void in(T unit) {
        this.unit = unit;
    }

    public void showInfo() {
        System.out.println(unit);
    }
}
