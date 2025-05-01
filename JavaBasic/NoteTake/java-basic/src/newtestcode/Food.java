package newtestcode;

import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private int kcal;

    public Food() {
    }

    public Food(int kcal, String name) {
        this.kcal = kcal;
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
               "kcal=" + kcal +
               ", name='" + name + '\'' +
               '}';
    }
}
