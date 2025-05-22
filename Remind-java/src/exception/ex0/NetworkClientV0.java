package exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 성공
        System.out.println(address + " 서버 연결 성공...!");
        return address + "에 접속을 완료했습니다.";
    }

    public String send(String data) {
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return data + " 전송을 완료했습니다.";
    }

    public void disconnect() {
        System.out.println(address+" 서버 연결 해제 완료...!");
    }
}
