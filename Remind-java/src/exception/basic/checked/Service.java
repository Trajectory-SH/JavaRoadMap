package exception.basic.checked;

public class Service {
    Client client = new Client();

    /*
     * 1) 예외를 잡아서 처리하는 코드
     * */
    public void callCatch() {
        try {
            client.call();//예외발생
        } catch (MyCheckedException e) {
            //예외처리 로직 작동
            System.out.println("예외처리. message = "+e.getMessage());//getMessage throwable 상속
        }
        System.out.println("정상흐름으로 돌아옵니다.");
    }

    /* 2)체크예외를 밖으로 던지기
        체크 예외는 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다...?
    * */

    public void callThrow() throws MyCheckedException {
        client.call();
    }

}
