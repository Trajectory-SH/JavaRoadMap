package collection.link_01;

public class NodeMain2 {
    public static void main(String[] args) {
        Node first = new Node("A");
        Node second = first.next = new Node("B");
        Node third = second.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);

    }
}
