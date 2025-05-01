package remind01.poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender s : senders) {
            s.sendMessage("안녕하세요 환영합니다!!");
        }
    }
}
