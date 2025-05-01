package remind01.poly.ex.pay0;

public class PayMain0{
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "Bad case";
        int amount3 = 1000;
        payService.processPay(payOption3, amount3);

    }
}
