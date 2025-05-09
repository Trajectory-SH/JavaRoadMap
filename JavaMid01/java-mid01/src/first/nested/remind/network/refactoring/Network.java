package first.nested.remind.network.refactoring;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage net = new NetworkMessage(text);
        net.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
