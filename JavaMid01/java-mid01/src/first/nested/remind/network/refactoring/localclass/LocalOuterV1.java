package first.nested.remind.network.refactoring.localclass;

public class LocalOuterV1 {
    //Outer Class의 인스턴스 멤버 변수
    private String outInstanceVar = "외부클래스 인스턴스 멤버 변수";

    //Outer Class의 인스턴스 멤버 함수 -> Public으로 선언했으니 외부에 필요한 기능을 제공하겠구나.
    public void process(String paraVar) {

        String localVar ="인스턴스 메서드 지역 변수";

        //인스터스 메서드 내부에 "지역 클래스" 선언 -> 지역 변수처럼 취급하고 Scoping은 코드 블럭 내부
        class LocalPrinter{
            String value = "지역클래스 인스턴스 멤버 변수";

            //지역 클래스의 인스턴스 메서드
            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paraVar = " + paraVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }


        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }


    public static void main(String[] args) {
        LocalOuterV1 outer = new LocalOuterV1();
        outer.process("매개변수");
    }

}



