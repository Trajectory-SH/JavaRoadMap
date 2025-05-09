package first.nested.remind.network.refactoring;


public class NetworkMain {
    public static void main(String[] args) {
        Network net = new Network();
        //Network의 인스턴스 참조를 통해서 인스턴스 메서드 sendMessage()에 접근함.
        net.sendMessage("helloJava");

    }
}
