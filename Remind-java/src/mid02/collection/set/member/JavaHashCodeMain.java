package mid02.collection.set.member;

public class JavaHashCodeMain {
    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        Member member2 = new Member("idA");
        Member member1 = new Member("idA");

        System.out.println(member1 == member2);
        System.out.println(member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        System.identityHashCode(member1);
        System.identityHashCode(member2);

// 실제 참조값처럼 보이는 값 출력
        System.out.println("member1 identityHashCode = 0x" + System.identityHashCode(member1));
        System.out.println("member2 identityHashCode = 0x" + System.identityHashCode(member2));

    }
}
