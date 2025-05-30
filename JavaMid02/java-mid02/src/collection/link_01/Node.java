package collection.link_01;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {//더 이상 뒤에 가리키는 Node가 없음
                sb.append("->");
            }
            x = x.next;
        }

        sb.append("]");

        return sb.toString();
    }




    /* @Override
    public String toString() {
        return "Node{" +
               "item=" + item +
               ", next=" + next +
               '}';
    }*/


}
