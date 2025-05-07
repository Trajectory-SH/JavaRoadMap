package first.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            //자기 자신의 멤버변수에는 당연히 접근이 가능함
            System.out.println("내부 클래스의 인스턴스 멤버 변수: "+this.nestedInstanceValue);

            /*
            외부 클래스의 인스턴스 멤버변수는 접근이 불가능함. 당연히 인스턴스에 대한 참조가 없기 때문에!
            System.out.println("바깥 클래스의 인스턴스 멤버 변수: "+outInstanceValue);
            */

            //private여도 접근이 가능하다.
            System.out.println("바깥 클래스의 클래스 변수: "+NestedOuter.outClassValue);
        }
    }
}
