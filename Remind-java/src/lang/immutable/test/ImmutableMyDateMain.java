package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("날짜 재설정하기");
        date2= date1.setYear(2026);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
