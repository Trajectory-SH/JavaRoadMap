package array.ex;

import java.util.Scanner;

public class ArrayEx7Try01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("총 학생수를 입력해주세요 >>");
        int stuNum = scan.nextInt();

        //연산에 필요한 array 선언
        int[][] stuArray = new int[stuNum][3];
        String[] subject = {"국어", "영어", "수학"};

        //데이터 대입
        for (int row = 0; row < stuArray.length; row++) {
            int totalScore = 0;
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int col = 0; col < stuArray[row].length; col++) {
                System.out.print(subject[col] + " 점수: ");
                stuArray[row][col] = scan.nextInt();

            }

        }

        for (int row = 0; row < stuArray.length; row++) {
            int totalScore = 0;
            for (int col = 0; col < stuArray[row].length; col++) {
                int score = stuArray[row][col];
                totalScore += score;
            }
            double avg = (double) totalScore / subject.length;

            System.out.println((row + 1) + "번 학생의 총점 : " + totalScore + ", 평균: " + avg);
        }


    }

}
