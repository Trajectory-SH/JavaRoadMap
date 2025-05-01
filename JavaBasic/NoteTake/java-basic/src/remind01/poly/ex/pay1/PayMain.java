package remind01.poly.ex.pay1;

import java.util.Scanner;

public class PayMain {

    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scan = new Scanner(System.in);
        boolean stopFlag = false;

        while (!stopFlag) {

            System.out.println("1. 결제창");
            System.out.println("2. 종료");

            System.out.print("메뉴 번호를 선택해주세요 >> ");
            int num = Integer.parseInt(scan.nextLine());
            switch (num){
                case 1:
                    System.out.println("=====결제창 =====");

                    System.out.print("결제 수단을 입력해주세요 >>");
                    String option = scan.nextLine();
                    System.out.print("결제 금액을 입력해주세요 >>");
                    int amount = Integer.parseInt(scan.nextLine());
                    System.out.println("================");

                    payService.processPay(option, amount);
                    break;

                case 2:
                    stopFlag = true;
                    System.out.println("======================");
                    System.out.println("결제 시스템을 종료하겠습니다.");
                    System.out.println("======================");
                    break;

                default:
                    System.out.println("올바른 메뉴를 선택해주세요");
                    break;



            }



        }





    }
}
