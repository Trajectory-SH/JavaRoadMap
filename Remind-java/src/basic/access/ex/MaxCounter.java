package basic.access.ex;

public class MaxCounter {
    private int count=1;
    private int maxCount;

    public MaxCounter(int i) {
        maxCount = i;
    }


    public int getCount() {
        return count;
    }

    public void increment() {
        if (count <= maxCount) {
            System.out.println("현재 count : " + count);
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }

    }

    @Override
    public String toString() {
        return "MaxCounter{" +
               "count=" + count +
               ", maxCount=" + maxCount +
               '}';
    }
}
