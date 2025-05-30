package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    //DI(Dependency Injection) -> 의존 관계 주입 : 나중에 Spring에서 많이 사용
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - starTime) + "ms");
    }
}
