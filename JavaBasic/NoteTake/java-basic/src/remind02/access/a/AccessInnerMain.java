package remind02.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        System.out.println("==============");
        //public field, method
        data.publicField = 1 ;
        data.publicMethod();


        System.out.println("==============");
        //default field, method
        //intelliJ에서 default access modifier를 package-privated로 표현한다 .
        data.defaultField = 2;
        data.defaultMethod();


        System.out.println("==============");
        //private field, method
//        data.privateField = 3;
//        data.privateMethod();


        System.out.println("==============");
        data.innerAccess();

    }
}
