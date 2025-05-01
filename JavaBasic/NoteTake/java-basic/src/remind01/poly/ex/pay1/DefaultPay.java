package remind01.poly.ex.pay1;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("===============");
        System.out.println("결제수단이 존재하지 않습니다.");
        System.out.println("===============");
        return false;
    }
}
