package exception.basic.checked;

public class Client {

    //예외를 밖으로 던지는 메서드
    public void call() throws MyCheckedException {
        throw new MyCheckedException("exception!!!");
    }
}
