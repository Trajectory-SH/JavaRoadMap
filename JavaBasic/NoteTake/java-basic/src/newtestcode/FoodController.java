package newtestcode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FoodController {
    public void fileSave(String fileName) throws IOException {
        Food food = new Food(20, "밥");
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(food);
    }
}
