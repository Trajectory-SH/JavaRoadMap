package testcode;

import java.io.Serializable;

public class Food implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int kcal;

    // 기본 생성자
    public Food() {}

    // 매개변수 있는 생성자
    public Food(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return "Food{name='" + name + "', kcal=" + kcal + "}";
    }
}