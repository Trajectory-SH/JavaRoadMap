package exception.ex1;
import exception.ex0.NetworkClientV0;

public class NetworkServiceV1_1 {


    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);//추가
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
