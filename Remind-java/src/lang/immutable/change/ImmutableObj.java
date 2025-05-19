package lang.immutable.change;

public class ImmutableObj {
    private final int value;


    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
        //새로운 ImmutableObj 객체를 return
        //사용자는 새로운 참조 변수에 받아서 사용해야한다.
    }

    public int getValue() {
        return value;
    }
}
