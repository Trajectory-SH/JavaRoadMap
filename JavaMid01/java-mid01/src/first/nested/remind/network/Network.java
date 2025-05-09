package first.nested.remind.network;

public class Network {


    //인스턴스 메서드 영역
    public void sendMessage(String text) {
        //public Class이기 때문에 어떤 곳에서도 접근이 가능하다.
        //NetworkMessage 생성자를 호출 + text를 전달 받아 this.content에 할당
        NetworkMessage message = new NetworkMessage(text);
        message.print();
    }
}
