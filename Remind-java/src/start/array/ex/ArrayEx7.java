package start.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subject = {"국어", "수학", "영어"};

        System.out.print("성적을 입력할 학생 수를 입력하세요: ");
        int studentCount = Integer.parseInt(scanner.nextLine());
        double[][] studentScore = new double[studentCount][2];
        int[][] student = new int[studentCount][3];

        for (int n = 0; n < student.length; n++) {
            int totalScore = 0;

            System.out.println((n+1) + "번째 학생의 성적을 입력하세요: ");
            for (int i = 0; i < subject.length; i++) {
                System.out.print(subject[i] + " 점수: ");
                student[n][i] = Integer.parseInt(scanner.nextLine());
                totalScore += student[n][i];
            }
            double avg = totalScore / 3.0;
            studentScore[n][0] = totalScore;
            studentScore[n][1] = avg;
        }

        for (int i = 0; i<student.length; i++) {
            System.out.println((i+1)+"번 학생의 총점: "+studentScore[i][0]+" , 평균: "+studentScore[i][1] );
        }



    }
}
