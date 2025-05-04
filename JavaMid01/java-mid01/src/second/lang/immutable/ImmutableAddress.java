package second.lang.immutable;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {//setter는 사용이 불가능함
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
               "value='" + value + '\'' +
               '}';
    }

}
