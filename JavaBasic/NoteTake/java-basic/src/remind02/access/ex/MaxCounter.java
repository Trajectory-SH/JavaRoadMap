package remind02.access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count <= max) {
            System.out.println("count 값: " + count);
            count++;
        }else {
            System.out.println("count값이 max값을 초과했습니다(MAX값): "+max);
        }
    }

    public int getCount() {
        System.out.println("count를 출력합니다.");
        System.out.println("Final Count : "+count);
        return count;
    }
}
