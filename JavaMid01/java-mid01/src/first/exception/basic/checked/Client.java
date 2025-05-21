package first.exception.basic.checked;

public class Client {
    public void call() {

        //문제 상황
        throw new MyCheckedException("ex");
    }
}
