package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        //String에서 이미 String에 대해서 compareTo()를 만들어놨음
        return o1.getId().compareTo(o2.getId());
    }
}
