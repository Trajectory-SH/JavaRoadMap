package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                System.out.println("===exception Handler Excute===");
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상종료합니다.");


    }

    private static void exceptionHandler(Exception e) {
        //처리할 수 없는 에러들(대부분은 Runtime Exception이다)을 동시에 처리하는 logic
        System.out.println("사용자 메시지: 죄송합니다. 알 수없는 문제가 발생했습니다.");
        System.out.println("====Debug Message====");
        e.printStackTrace();//스택 트레이스 출력


        //필요하다면 각 예외별로 추가 처리가 가능해진다.
        if (e instanceof SendExceptionV4 sendEx) {
            //SendExceptionV4 sendEx = (SendExceptionV4) e;
            //downCasting => 인라인 변수선언도 가능하다.
            System.out.println("[전송 오류] 전송 데이터: "+sendEx.getSendData());
            System.out.println(sendEx.getMessage());

        }


            }
}
