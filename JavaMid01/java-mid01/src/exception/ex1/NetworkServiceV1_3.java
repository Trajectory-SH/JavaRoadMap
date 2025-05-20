package exception.ex1;

public class NetworkServiceV1_3 {


    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);//추가


        String connectResult = client.connect();
        //중간에 return이 필요가 없다.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드" + connectResult);
        } else {
            String sendResult =  client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류코드 " + sendResult);
            }

        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
