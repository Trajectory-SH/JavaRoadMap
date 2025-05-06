package first.array.ex;


import java.util.Scanner;

public class ArrayEx7 {
    /*
    1. 사용잘부터 4명의 학생 국어,수학,영어 점수 입력
    2. 각 학생의 총점과 평귲을 계산하는 프로그램
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("총 학생수를 입력해주세요 >> ");
        int count = scan.nextInt();

        //다양한 방식의 Array 선언 방식
//        int[] hello;
//        hello = new int[5];
//        int[] hello1 = new int[5];
//        int[] hello2 = new int[]{1, 2, 3, 4, 5};
//        int[] hello3 = {1, 2, 3, 4, 5}; => 최적화된 Array 선언!!

        //for-each 문으로 2차원 배열 접근 -> 값을 입력할때는 불가능
        //일반적으로 값을 출력할 때만 for-each문을 사용한다.
        int[][] studentList = new int[count][3];
        String[] subject = {"국어", "영어", "수학"};


        //학생 데이터 입력
        for (int row = 0; row < studentList.length; row++) {
            System.out.println(count + "번 학생의 성적을 입력하세요: ");
            for (int col = 0; col < studentList[row].length; col++) {
                System.out.print(subject[col] + " 점수: ");
                studentList[row][col] = scan.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < studentList.length; i++) {
            for (int j = 0; j < studentList[i].length; j++) {
                total += studentList[i][j];
                double avg = (double) total / studentList[i].length;
                System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
            }
        }
    }
}
