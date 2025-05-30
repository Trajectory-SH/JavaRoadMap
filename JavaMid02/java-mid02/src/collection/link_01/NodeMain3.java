package collection.link_01;


public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        Node second = first.next = new Node("B");
        Node third = second.next = new Node("C");

        //모든 노드 탐색
        System.out.println("1.모든 노드 탐색");
        printAll(first);

        //마지막 노드 조회
        System.out.println("2.마지막 노드 조회");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드 조회하기
        System.out.println("3.특정 index의 노드 조회하기");

        int index = 1;
        Node index2Node = getNode(first, index);

        //데이터 추가하기
        System.out.println("4.데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);

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
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        System.out.println("index = " + index + ", Node: " + x);
        return x;
    }


    private static void add(Node node, Object e) {
        /*Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        x.next = new Node(e);*/
        getLastNode(node).next = new Node(e);
    }
}
