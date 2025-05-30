package collection.list;

public interface MyList<E> {

    //해당 리스트의 size를 return
    int size();

    //새로운 element를 List에 추가(맨 뒤 Or 지정한 index)
    void add(E e);

    void add(int index, E e);

    //해당 index에 존재하는 E 타입의 item을 return
    E get(int index);

    //해당 index의 item을 argument로 받은 element로 바꾼다.
    E set(int index, E element);

    //해당 index의 내용을 삭제 -> node의 경우에는 참조를 업애서 GC가 동작하게한다.
    E remove(int index);

    //검색 기능 E type의 o가 들어있는 index를 return
    int indexOf(E o);
}
