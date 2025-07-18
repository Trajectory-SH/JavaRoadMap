package exception.ex1;

public class NetworkClientV1 {
    private final String address;//상수로 주소 선언
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 실패
        if (connectError) {
            System.out.println(address+" 서버 연결 실패");
            return "connectError가 발생했습니다...!";
        }

        //연결 성공
        System.out.println(address+" 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError가 발생했습니다...!";
        }
        System.out.println(address + " 서버에 데이터를 전송했습니다: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {//String class의 메서드
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }








}
