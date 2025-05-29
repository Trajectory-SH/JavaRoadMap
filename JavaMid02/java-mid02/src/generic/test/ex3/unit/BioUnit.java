package generic.test.ex3.unit;

public class BioUnit {
    private String name;
    private int hp;

    public BioUnit(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", HP: " + hp;
    }
}
