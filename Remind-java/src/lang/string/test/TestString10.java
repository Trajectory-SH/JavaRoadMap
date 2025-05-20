package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] parts = new String[3];


        parts = fruits.split(",");

        for (String a : parts) {
            System.out.println(a);
        }
        //join
        String joinedString = String.join("->", parts);

        System.out.println("joinedString = " + joinedString);


    }
}
