package first.nested.nested.ex1;

public class Network {
    //자동 default 생성자...

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
