package exception.ex0;

public class NetworkServiceV0 {



    public void sendMessage(String data) {
        String address = "http://www.inflearn.com";//원래라면 실제로 서버에서 어떤 요청이 날아오겠지만...
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
