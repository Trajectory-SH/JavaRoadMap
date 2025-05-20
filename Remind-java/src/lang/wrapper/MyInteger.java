package lang.wrapper;

public class MyInteger {
    private final int value;//불변객체 최초의 생성자를 통해서 값이 정해지면 수정이 불가능하고
                            //만약 새로운 값으로 바꾸고 싶다면 새로운 객체를 생성해서 return하고 사용한다.

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
