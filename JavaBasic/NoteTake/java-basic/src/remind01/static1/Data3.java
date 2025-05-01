package remind01.static1;

public class Data3 {
    public String name;
    public static int count; //static 클래스 공용변수입니다.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
