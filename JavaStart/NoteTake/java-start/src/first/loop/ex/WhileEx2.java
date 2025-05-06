package first.loop.ex;

public class WhileEx2 {//짝수 출력

    public static void main(String[] args) {
        //while
        int count = 0;
        System.out.println("====WHILE====");
        while (count < 10) {
            int num = (count + 1) * 2;
            System.out.println(num);
            count++;
        }

        //for
        System.out.println("====FOR====");
        for (int i = 0; i < 10; i++) {
            int num = (i + 1) * 2;
            System.out.println(num);
        }

    }
}
