package remind02.constructor.test;

public class Child extends Parent {
    int a;
    int b;
    int c;
    int d;

    public Child(int a ,int b) {
        this(a, b, 50);
    }

    public Child(int a, int b, int c) {
        super(a, b, c);
    }
}
