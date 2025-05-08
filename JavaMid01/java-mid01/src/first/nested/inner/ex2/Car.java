package first.nested.inner.ex2;



public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine();
    }

    public void start() {
        engine.engStart();
        System.out.println(model + "시작 완료 ");
    }

    public class Engine {
        public void engStart() {
            System.out.println("레벨 확인" + chargeLevel);
            System.out.println(model+"엔진 구동!");
        }

    }
}
