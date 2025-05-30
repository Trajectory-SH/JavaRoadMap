package collection.link_01;

public class NodeMain1 {
    public static void main(String[] args) {

        Node first = new Node("A");
        Node second = first.next = new Node("B");
        Node third = second.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}