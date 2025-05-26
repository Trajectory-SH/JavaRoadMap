package exception.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUncheckedException("문제 발생!!");
    }
}
