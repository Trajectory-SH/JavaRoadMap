package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

/*    @Override
    public String toString() {
        return "Node{" +
               "item=" + item +
               ", next=" + next +
               '}';
    }*/

    @Override
    public String toString() {
        //[A -> B -> C]
        //문자열을 다룰 때는 StringBuilder 특히 반복문의 상황에서 -> [String 복습하기]
        StringBuilder sb = new StringBuilder();
        Node x = this;//x01
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
