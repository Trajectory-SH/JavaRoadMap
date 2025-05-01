package array.ex;

import java.util.Scanner;

public class ArrayEx7Try02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] subject = {"국어", "영어", "수학"};

        System.out.print("총 학생 수를 입력해주세요: ");
        int num = scan.nextInt();

        int[][] studentScore = new int[num][subject.length];
        System.out.println();


        for (int row = 0; row < num; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int col = 0; col < subject.length; col++) {
                System.out.print(subject[col] + "점수:");
                studentScore[row][col] = scan.nextInt();
            }
        }

        //변수를 제대로 초기화하고 어디서 연산을 수행하는지에 대한 설계와 이해
        for (int row = 0; row < num; row++) {
            int totalScore = 0;
            for (int col = 0; col < subject.length; col++) {
                totalScore += studentScore[row][col];
            }
            double avg = (double) totalScore / subject.length;
            System.out.println((row + 1) + "번 학생의 총점: " + totalScore + ", 평균: " + avg);
        }
        System.out.println("====The End====");
    }
}
