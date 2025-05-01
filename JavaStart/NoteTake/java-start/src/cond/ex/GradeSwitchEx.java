package cond.ex;

import java.util.Scanner;

public class GradeSwitchEx {//학점 성취도 Switch문

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade;

        System.out.print("시험 점수를 입력해주세요!");
        int score = scan.nextInt();

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("grade : " + grade);

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
        }
    }
}
