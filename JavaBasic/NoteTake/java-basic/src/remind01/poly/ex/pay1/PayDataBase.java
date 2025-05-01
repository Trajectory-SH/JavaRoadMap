package remind01.poly.ex.pay1;

public abstract class PayDataBase {
    //추상클래스이기 때문에 객체생성 방지
    //추상클래스는 어떠한 기능만 수행하고 실제 객체를 생성할 일이 없다.
    public static Pay findPay(String option) {//Pay 타입의 객체 참조변수 return...
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
//결제 수단이 추가될때마다 여기에서 코드를 변경하면 된다.
    }
}
