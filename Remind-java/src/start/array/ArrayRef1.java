package start.array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students = new int[5]; //int 자료형을 갖고 있는 5 size의 배열 자료형
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        System.out.println(students); // [I = int형 배열을 뜻한다.@ 뒤의 16진수는 참조값770ㅐㅣ00
        for (int score : students) {
            System.out.println("학생 점수 : " + score);
        }
    }
}
