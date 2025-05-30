package collection.link_01;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            getLastNode().next = newNode;
        }
        size++;
    }

    //메서드 오버로딩(Linked List 값 추가)
    public void add(int index, Object object) {
        Node newNode = new Node(object);
        if (index == 0) {
            newNode.next = first;

        } else {
            Node prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue =  x.item;
        x.item = element;
        return oldValue;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    public int indexOf(Object o) {
        Node x = first;
        int index = 0;
        while (!(x.item.equals(o))) {
            if (x.next == null) {
                System.out.println("===Exception===");
                System.out.println("찾으시는 값이 List에 존재하지 않습니다.");
                return -1;
            }
            x = x.next;
            index++;
        }
        return index;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
               "first=" + first +
               ", size=" + size +
               '}';
    }
}
