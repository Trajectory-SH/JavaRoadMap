package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //불변 객체 클래스이기 때문에 setter 설정 안함.

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public ImmutableMyDate setYear(int i) {
        return new ImmutableMyDate(i,this.month,this.day);
    }
}
