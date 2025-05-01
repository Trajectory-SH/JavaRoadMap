package loop.ex;

public class WhileEx1 {//자연수 출력
    public static void main(String[] args) {

        //while
        int count = 1;
        System.out.println("===While 반복문===");
        while(count<=10){
            System.out.println(count);
            count++;
        }

        System.out.println("===For 반복문===");
        for(int i = 0;i<10;i++){
            System.out.println(i+1);
        }
    }
}
