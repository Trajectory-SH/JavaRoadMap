package construct.remind;

public class MethodInitMain2 {
    public static void main(String[] args) {
        //여기서 member1이 또 선언 되는데 Main1에도 member1이 선언되어있다
        //그것이 가능한 이유는 local variable의 Scope 때문이다...main 메서드의 종료시(코드블록의 마지막에 도달했을 때) 사라짐...
        //즉 Main1 class파일과 Main2 class파일의의 main()은 서로 다른 지역 스코프(local scope)를 갖기 때문에 같은 이름의 변수를 선언해도 충돌하지 않는다.

        MemberInit member1 = new MemberInit();
        MemberInit member2 = new MemberInit();

//        setMember(member1,"자바자바",31,21);
//        setMember(member2,"어려버라",22,10);

        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름: "+s.name+" 나이 :"+s.age+" 성적: "+s.grade);

        }
    }

    void setMember(MemberInit member,String name,int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
