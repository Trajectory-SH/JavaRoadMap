package lang.object.test;

import java.util.Objects;

public class Rectangle {
    int width;
    int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
               "height=" + height +
               ", width=" + width +
               '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }


}
