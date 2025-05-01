package remind01.poly.ex.pay1;

public class KakaoPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("===============");
        System.out.println("카카오페이 연결 시작");
        System.out.println(amount+"원 결제 시도");
        System.out.println("===============");
        return true;
    }
}
