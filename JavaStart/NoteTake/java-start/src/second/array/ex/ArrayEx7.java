package second.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};
        System.out.print("학생 수를 입력해주세요: ");
        int inputNum = scanner.nextInt();
        int[][] students = new int[inputNum][subjects.length];


        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int m = 0; m < subjects.length; m++) {
                System.out.print(subjects[m] + "점수: ");
                students[i][m] = scanner.nextInt();
            }
        }
        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int score : students[i]) {
                total += score;
            }
            double average = (double) total / subjects.length;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }


    }
}
