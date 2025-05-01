package testcode;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class FoodController {

    public void fileSave(String fileName) {
        // 저장할 Food 객체 생성 (예시: "사과", 20)
        Food food = new Food("사과", 20);

        try (
                // 파일 출력 스트림 생성
                FileOutputStream fos = new FileOutputStream(fileName);
                // 객체 출력 스트림으로 연결
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            // Food 객체를 파일에 저장
            oos.writeObject(food);
            System.out.println("파일 저장 완료: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    public class FoodApp {
//        public static void main(String[] args) {
//            FoodController fc = new FoodController();
//            fc.fileSave("food_data.dat");
//        }
//    }
}