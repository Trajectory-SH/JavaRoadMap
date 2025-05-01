package remind01.poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option::" + option + ", amount::" + amount);

        Pay pay = PayDataBase.findPay(option);
        // 정말로 중요한 개념들 한번에 정리 가능한 Code 한 줄
//        abstract Class이기 때문에 객체 생성을 따로 하지 않습니다.
//        static으로 선언되어 있기 때문에 Class이름으로 메서드에 접근합니다.
//         추상클래스에서는 굳이 객체 생성 필요없이 특정한 기능을 수행하기 위해서 사용합니다.
//        단지 PayDataBase 클래스는 추상 메서드가 없는 것일 뿐이다.
//        findPay메서드의 return값이 Pay type의 참조값이기 때문(new NaverPay()...)
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제 성공");
            System.out.println("=======");
        } else {
            System.out.println("결제 실패");
            System.out.println("=======");
        }
    }
}
