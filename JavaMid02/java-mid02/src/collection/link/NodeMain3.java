package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        
        //모든 노드 탐색
        System.out.println("모든 노드 탐색하기");
        printAll(first);
        
        //마지막 노드 조회
        Node lastNode = getLastNode(first);

        //특정 인덱스 노드 조회
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        //데이터 추가하기
        addNode(first, "D");

    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {//현재 node에서 next에 null값이 들어있으면 더이상
            //다음 노드를 참조하고 있지 않기 때문에 마지막 노드라고 볼 수 있다.
            x = x.next;
        }
        return x; //x.next == null;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void addNode(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);

    }
}
