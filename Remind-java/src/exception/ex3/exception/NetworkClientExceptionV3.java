package exception.ex3.exception;

public class NetworkClientExceptionV3 extends Exception {
    public NetworkClientExceptionV3(String message) {
        super(message);//Throwable 생성자의 (detailMessage)메시지로 던진다.
    }
}
